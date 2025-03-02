package com.wtc.landlord.util;

import java.security.SecureRandom;

public class Utils {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();
    private static final int size = 5;

    public static String getCaptcha() {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        System.out.println(sb);
        return sb.toString();
    }
}
