// Program to check spelling from user-defined dictionary

import java.util.Scanner;

public class SpellChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = sc.nextLine();
        String [] dict = {"Hello","World","Environment"};
        if (checkSpelling(word, dict)) {
            System.out.println(word + " is a valid word.");
        } else {
            System.out.println(word + " is not a valid word.");
        }
        sc.close();
    }
    public static boolean checkSpelling(String word, String [] dict) {
        for (int i = 0; i < dict.length; i++) {
            if (word.equals(dict[i])) {
                return true;
            }
        }
        return false;
    }
}