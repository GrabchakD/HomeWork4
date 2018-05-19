/*
Given a string str and character ch, find the frequency of occurrence ch in str.

        Format
        Input
        {char}
        {string}

        Output
        {frequency}

        Example
        Input
        a
        aaa156aadfsdaeraaaawq

        Output 10
*/

package HomeWork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next ("."). charAt (0);
        int i = 15;
        String s = "s";

        findCharCount(str, ch);
    }

    public static int findCharCount(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count ++;
            }
        }
        return count;
    }
}
