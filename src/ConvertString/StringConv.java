package ConvertString;

import java.util.*;

public class StringConv {
    final static Set<Character> vowels = Set.of('a', 'e', 'o', 'i', 'u', 'y');

    static Map<String, Integer> mySort(Map<String, Integer> initHashmap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(initHashmap.entrySet());

        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    static String getVowelCount(String str) {
        StringBuilder result = new StringBuilder();
        HashMap<String, Integer> wordList = new HashMap<>();
        int total = 0;

        for (String word : str.split(" ")) {
            int wordVowels = 0;
            for (int i = 0; i < word.length(); i++) {
                if (vowels.contains(word.charAt(i))) {
                    wordVowels++;
                    total++;
                }
                wordList.put(word, wordVowels);
            }
        }

        Map<String, Integer> sortedWordList = mySort(wordList);

        for (String word : sortedWordList.keySet()) {
            result.append("\n\t").append(word).append(": ").append(sortedWordList.get(word));
        }

        return "Vowel counting:" + result + "\n\tTotal vowel quantity is " + total;
    }

    static String upperCaseVowels(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (String word : str.split(" ")) {
            char[] wordBuilder = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                if (vowels.contains(word.charAt(i))) {
                    wordBuilder[i] = Character.toUpperCase(wordBuilder[i]);
                    break;
                }
            }
            strBuilder.append(wordBuilder).append(" ");
        }
        return strBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        System.out.println(getVowelCount(str));
        System.out.println(upperCaseVowels(str));
    }
}
