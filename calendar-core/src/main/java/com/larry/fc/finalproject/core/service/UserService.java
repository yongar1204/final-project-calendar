package com.larry.fc.finalproject.core.service;

import com.larry.fc.finalproject.core.domain.entity.User;
import com.larry.fc.finalproject.core.domain.repository.UserRepository;
import com.larry.fc.finalproject.core.dto.UserCreateReq;
import com.larry.fc.finalproject.core.util.Encryptor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final Encryptor bcryptEncryptor;

    @Transactional
    public User create(UserCreateReq userCreateReq) {
        userRepository.findByEmail(userCreateReq.getEmail())
                .ifPresent(u->{
                    throw new RuntimeException("cannot find user");
                });
        return userRepository.save(User.builder()
                .name(userCreateReq.getName())
                .email(userCreateReq.getEmail())
                .password(bcryptEncryptor.encrypt(userCreateReq.getPassword()))
                .birthday(userCreateReq.getBirthday())
                .build());
    }
    @Transactional
    public Optional<User> findPwMatchUser(String email, String password) {
        return userRepository.findByEmail(email)
                .map(u -> u.isMatched(bcryptEncryptor, password) ? u : null);
    }
}
