package ReformatNumbers;

import java.util.HashMap;
import java.util.Scanner;

public class StarNumbers {
    private final HashMap<Character, String[]> figures = new HashMap<>();

    public StarNumbers() {
        figures.put('0', new String[]{" ***** ", " *   * ", " *   * ", " *   * ", " *   * ", " *   * ", " ***** "});
        figures.put('1', new String[]{"    *  ", "  * *  ", "    *  ", "    *  ", "    *  ", "    *  ", "  **** "});
        figures.put('2', new String[]{" ***** ", "     * ", "     * ", " ***** ", " *     ", " *     ", " ***** "});
        figures.put('3', new String[]{" ***** ", "     * ", "     * ", " ***** ", "     * ", "     * ", " ***** "});
        figures.put('4', new String[]{" *   * ", " *   * ", " *   * ", " ***** ", "     * ", "     * ", "     * "});
        figures.put('5', new String[]{" ***** ", " *     ", " *     ", " ***** ", "     * ", "     * ", " ***** "});
        figures.put('6', new String[]{" ***** ", " *     ", " *     ", " ***** ", " *   * ", " *   * ", " ***** "});
        figures.put('7', new String[]{" ***** ", "     * ", "    *  ", "  ***  ", "   *   ", "   *   ", "   *   "});
        figures.put('8', new String[]{" ***** ", " *   * ", " *   * ", " ***** ", " *   * ", " *   * ", " ***** "});
        figures.put('9', new String[]{" ***** ", " *   * ", " *   * ", " ***** ", "     * ", "     * ", " ***** "});
    }

    String convert(int num) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            for (char c : Integer.toString(num).toCharArray()) {
                str.append(figures.get(c)[i]);
            }
            str.append('\n');
        }

        return str.toString();
    }

    public static void main(String[] args) {
        StarNumbers numbers = new StarNumbers();
        System.out.println(numbers.convert(new Scanner(System.in).nextInt()));
    }
}
