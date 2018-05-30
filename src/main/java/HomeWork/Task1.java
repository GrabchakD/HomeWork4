/*
Given an integer array. Move first k elements to the array end.

Input

{array length} {k}
{array values}

Output
{rotated array}

Example
Input

5 2
5 6 1 2 6

Output

1 2 6 5 6
*/

package HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 5;
        int k = 2;
        int arr[] = {5, 6, 1, 2, 6};

       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }*/

        System.out.println(rotateArr(arr, k));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] rotateArr(int[] arr, int k) {
        int[] temp = new int[k];
        int i = 0;
        int empty;
        int count = k;

        while (i != k) {
            temp[i] = arr[i];
            i++;
        }

        for (int j = 0; count != arr.length; j++) {
            empty = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = empty;
            count++;
        }

        return arr;
    }
}

