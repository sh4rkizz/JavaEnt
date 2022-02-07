package GetPrimeFactors;

import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        Set<Integer> factors = new HashSet<>();
        factors.add(1);
        try {
            int num = new Scanner(System.in).nextInt();

            for (int i = 2; i < Math.sqrt(num) + 1; i++) {
                while (num % i == 0) {
                    factors.add(i);
                    num /= i;
                }
            }
            factors.add(num);

            System.out.println(factors);
        } catch (InputMismatchException e) {
            System.out.println("Input is not of type int");
        }
    }
}