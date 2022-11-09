package algoitzy.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 일곱 난쟁이
public class BOJ2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        List<Integer> kids = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            kids.add(Integer.parseInt(br.readLine()));
            total += kids.get(i);
        }

        Collections.sort(kids);

        loop:
        for (int i = 0; i < kids.size(); i++) {
            for (int j = i + 1; j < kids.size(); j++) {
                if (total - (kids.get(i) + kids.get(j)) == 100) {
                    kids.remove(i);
                    kids.remove(j - 1);
                    break loop;
                }
            }
        }

        for (int kid : kids) {
            System.out.println(kid);
        }
    }
}