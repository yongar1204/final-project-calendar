package com.larry.fc.finalproject.core.util;

public interface Encryptor {
    public String encrypt(String origin);
    public boolean isMatch(String origin, String hashed);
}
