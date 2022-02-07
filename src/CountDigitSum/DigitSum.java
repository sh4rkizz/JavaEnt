package CountDigitSum;

import java.util.Scanner;

public class DigitSum {
    static int getSum(String str) {
        int cur_sym_ascii, sum = 0;
        for (int i = 0; i < str.length(); i++) {
            cur_sym_ascii = (int) str.charAt(i);

            if (48 < cur_sym_ascii && cur_sym_ascii < 58) {
                sum += cur_sym_ascii - 48;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        System.out.println(getSum(str));
    }
}