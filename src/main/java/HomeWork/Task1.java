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
        int length = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[length];

        System.out.println(rotateArr(arr, k));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] rotateArr(int[] arr, int k) {
        int[] temp = new int[k];
        int i = 0;
        int empty;

        while (k != arr.length) {
            temp[i] = arr[k];
            k++;
            i++;
        }

        for (int j = 0; k != arr.length - 1; j++) {
            empty = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = empty;
            k++;
        }

        for (int j = 0; k != arr.length; j++) {
            arr[k] = temp[i];
            k++;
        }

        return arr;
    }
}

