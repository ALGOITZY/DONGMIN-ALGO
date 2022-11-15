package algoitzy.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 잃어버린 괄호
public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] expArr = br.readLine().split("-");

        int min = 0;
        for (int i = 0; i < expArr.length; i++) {
            int num = 0;
            if (expArr[i].contains("+")) {
                for (String number : expArr[i].split("\\+")) {
                    num += Integer.parseInt(number);
                }
            } else {
                num += Integer.parseInt(expArr[i]);
            }
            min = (i == 0) ? num : min - num;
        }
        System.out.println(min);
    }
}
