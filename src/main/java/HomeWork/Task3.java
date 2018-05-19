/*

Given a sorted integer array.
Print all ranges in which each next element is increased by one.
The range is defined its minimal and maximal values.
If the range contains one element print only its value.

        Input
        {array_length}
        {array_values}

        Output
        [{min_range1} {max_range1}]...[{min_rangeN} {max_rangeN}]

        Example
        Input
        11
        1 2 3 5 8 9 10 13 14 15 16

        Output
        [1 3][5][8 10][13 16]

*/


package HomeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int iter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("[" + arr[0]);

        iter = 1;
        while (iter < arr.length - 1) {

             if ((arr[iter] - arr[iter - 1] != 1) && (arr[iter + 1] + arr[iter] != 1)) {
                System.out.print("[" + arr[iter] + "]");
            } else if (arr[iter] - arr[iter - 1] != 1) {
                System.out.print("[" + arr[iter]);
            } else if (arr[iter + 1] - arr[iter] != 1) {
                System.out.print(" " + arr[iter] + "]");
            }

            iter++;
        }

        System.out.print(" " + arr[iter] + "]");
    }
}