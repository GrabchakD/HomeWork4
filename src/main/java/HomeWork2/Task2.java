/*
Given an array of characters char[] length of N.
        Please, reverse part of the array, from i to j indexes. Try to make it in-place (without additional memory).
        0 <= i <= j < N.

        Example
        Input
        2 4 - i, j indexes. abcdefg

        Output
        abedcfg - substring "cde" was reversed to "edc".
*/

package HomeWork2;

public class Task2 {
    public static void main(String[] args) {
        int indexStart = 2;
        int indexEnd = 4;
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        System.out.println(reversePart(indexStart, indexEnd, ch));
    }

    public static char[] reversePart(int indexStart, int indexEnd, char[] ch) {
        char[] result = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (i > indexStart - 1 && i - 1 <= indexEnd +1) {
                result[i] = ch[indexEnd];
                indexEnd--;
            } else {
                result[i] = ch[i];
            }
        }
        return result;
    }
}