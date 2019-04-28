package com.example.cryptographer;

public class Crypt {
    public static String crypt(final int method, final String original) {
        if (method == 1) {
            return methodOne(original);
        } else if (method == 2) {
            return methodTwo(original);
        } else if (method == 3) {
            return methodThree(original);
        } else if (method == 4) {
            return methodFour(original);
        } else if (method == 5) {
            return methodFive(original);
        } else {
            return methodSix(original);
        }
    }

    public static String methodOne(final String input) {
        return "hello";
    }

    public static String methodTwo(final String input) {
        return null;
    }

    public static String methodThree(final String input) {
        return null;
    }

    public static String methodFour(final String input) {
        return null;
    }

    public static String methodFive(final String input) {
        return null;
    }

    public static String methodSix(final String input) {
        return null;
    }
}
