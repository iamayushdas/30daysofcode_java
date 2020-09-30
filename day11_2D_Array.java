import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int row=0; row<4; row++){
            for (int column=0; column<4; column++){
                int sum = arr[row][column] + arr[row][column + 1] + arr[row][column+2]
                                           + arr[row+1][column+1] +
                         arr[row+2][column] + arr[row+2][column+1] + arr[row+2][column+2];                 
                         if(sum>maxSum){
                              maxSum = sum;
                          }
            }
        }
        System.out.println(maxSum);



        scanner.close();
    }
}
