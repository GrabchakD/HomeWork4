/*
Given a string, detect if it is a palindrome.
        * Palindrome is a sequence of chars which reads the same backward or forward.

        Format
        Input
        {string}

        Output
        {is palindrome | isn't palindrome}

        Example
        Input
        madam

        Output
        is palindrome
*/

package HomeWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        if (checkPalindrom(words)) {
            System.out.println(words + " is palindorme!");
        } else {
            System.out.println(words + " is not palindome!");
        }
    }

    public static boolean checkPalindrom(String words) {
        int i = words.length() - 1;
        int j = 0;
        while(i > j) {
            if(words.charAt(i) != words.charAt(j)) {

                return false;
            }
            i--;
            j++;
        }

        return true;
    }
}
