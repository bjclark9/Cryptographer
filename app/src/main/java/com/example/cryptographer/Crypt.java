package com.example.cryptographer;

import java.util.Random;

public class Crypt {
    public static String crypt(final int method, final String original) {
        if (original == null) {
            return null;
        }
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
        String main = input;
        main = main.replace('!', ' ');
        main = main.replace(',', ' ');
        main = main.replace('.', ' ');
        main = main.replace('?', ' ');
        main = main.replace('"', ' ');
        main = main.trim();
        String[] array = main.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = methodFour(array[i]);
        }
        String toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            toReturn = toReturn + " " + array[i];
        }
        return toReturn;
    }

    public static String methodTwo(final String input) {
        String main = input;
        main = main.replace('!', ' ');
        main = main.replace(',', ' ');
        main = main.replace('.', ' ');
        main = main.replace('?', ' ');
        main = main.replace('"', ' ');
        main = main.trim();
        String[] words = main.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace('!', ' ');
            words[i] = words[i].replace(',', ' ');
            words[i] = words[i].replace('.', ' ');
            words[i] = words[i].replace('?', ' ');
            words[i] = words[i].replace('"', ' ');
            words[i] = words[i].trim();
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            char[] array = words[i].toCharArray();
            if (array.length == 0) {
                continue;
            }
            if (array[0] == 'a' || array[0] == 'e' || array[0] == 'i' || array[0] == 'o' || array[0] == 'u') {
                char[] temp = new char[array.length + 2];
                for (int j = 0; j < array.length; j++) {
                    temp[j] = array[j];
                }
                temp[array.length] = 'a';
                temp[array.length + 1] = 'y';
                words[i] = new String(temp);
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 'a' || array[j] == 'e' || array[j] == 'i' || array[j] == 'o' || array[j] == 'u') {
                    char[] temp = new char[array.length + 2];
                    for (int k = j; k < array.length; k++) {
                        temp[k - j] = array[k];
                    }
                    for (int k = 0; k <= j; k++) {
                        temp[array.length - j + k] = array[k];
                    }
                    temp[array.length] = 'a';
                    temp[array.length + 1] = 'y';
                    words[i] = new String(temp);
                    break;
                }
            }
        }
        String toReturn = words[0];
        for (int i = 1; i < words.length; i++) {
            toReturn = toReturn + " " + words[i];
        }
        return toReturn;
    }

    public static String methodThree(final String input) {
        char[] array = input.toCharArray();
        char[] temp = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - 1 - i];
        }
        return new String(temp);
    }

    public static String methodFour(final String input) {
        char[] array = input.toCharArray();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length);
            char toMove = array[i];
            array[i] = array[index];
            array[index] = toMove;
        }
        return new String(array);
    }

    public static String methodFive(final String input) {
        String cypher = "";
        for (int i = 0; i < input.length(); i++) {
            int asc = input.charAt(i);
            asc = ((asc/2) + 6);
            char character = (char) asc;
            cypher += character;
        }
        for (int i = 0; i < cypher.length(); i++) {
            int ascii = cypher.charAt(i);
            if (ascii > 30) {
                ascii = 127 - ascii;
            }
            char character = (char) ascii;
            cypher = cypher.replace(cypher.charAt(i), character);
        }
        return cypher;
    }

    public static String methodSix(final String input) {
        String cypher = "";
        for (int i = 0; i < input.length(); i++) {
            Random rand = new Random();
            int randInt = rand.nextInt(128);
            if (randInt == 32) {
                randInt = 33;
            }
            char character = (char) randInt;
            cypher += character;
        }
        return cypher;
    }
}
