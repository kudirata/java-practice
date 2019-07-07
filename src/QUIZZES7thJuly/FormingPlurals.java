package QUIZZES7thJuly;

import java.util.Scanner;

public class FormingPlurals {
    static final String SENTINEL = "done";
    static final Scanner IN = new Scanner(System.in);
    static String[] exceptions = {"fish", "fox", "deer", "moose", "sheep", "cattle"};

    public static void run() {
        while (true) {
            System.out.println("Enter a word to make it plural. Enter 'done' to stop: ");
            String noun = IN.nextLine();
            if (noun.toLowerCase().equals(SENTINEL)) {
                System.out.println("Goodbye...");
                break;
            }
            System.out.println(makePlural(noun) + " ");
        }
    }

    public static void checkExceptions() {

    }

    static String makePlural(String singularWord) {
        String pluralWord = "";
        int length = singularWord.length();
        String checker = singularWord.substring(0, singularWord.length() - 1);
        char lastLetter = singularWord.charAt(singularWord.length() - 1);

        if (length == 1) {
            pluralWord = singularWord + "'s";
        } else
            switch (lastLetter) {
                case 's':
                case 'x':
                case 'z':
                    pluralWord = singularWord + "es";
                    break;
                case 'h':
                    if ((singularWord.charAt(singularWord.length() - 2) == 'c') || (singularWord.charAt(singularWord.length() - 2) == 's')) {
                        pluralWord = singularWord + "es";
                        break;
                    }
                case 'f':
                    if (EnglishConsonant(singularWord.charAt(singularWord.length() - 2))) {
                        pluralWord = checker + "ves";
                        break;
                    }
                case 'y':
                    if (EnglishConsonant(singularWord.charAt(singularWord.length() - 2))) {
                        pluralWord = checker + "ies";
                        break;
                    }
                default:
                    pluralWord = singularWord + "s";
                    break;
            }
        return pluralWord;
    }

    public static boolean EnglishConsonant(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return false;
            default:
                return true;
        }
    }


    public static void main(String[] args) {
        run();
    }
}