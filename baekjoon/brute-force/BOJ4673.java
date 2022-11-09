package algoitzy.baekjoon.bruteforce;

// 셀프 넘버
public class BOJ4673 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (selfNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // 셀프 넘버 체크
    private static boolean selfNumber(int num) {

        for (int i = num - 1; i >= 1; i--) {
            int number = i;
            int result = number;

            while (number > 0) {
                result += number % 10;
                number /= 10;
            }

            if (result == num) {
                return false;
            }
        }
        return true;
    }
}
