

import java.util.*;

public class Man {
    public static void main(String[] args) {

        List<String> textList = new ArrayList<>();
        textList.add("кот ток");
        textList.add("автор товар");
        textList.add("атлас салат");


        Map<String, List<String>> anagramGroups = new HashMap<>();


        for (String row : textList) {

            String[] words = row.split(" ");

            for (String word : words) {

                String cleanWord = word.toLowerCase();


                char[] letters = cleanWord.toCharArray();
                Arrays.sort(letters);
                String key = new String(letters);

                if (!anagramGroups.containsKey(key)) {
                    anagramGroups.put(key, new ArrayList<>());
                }


                anagramGroups.get(key).add(word);
            }
        }


        System.out.println("-ГРУППИРОВКА-");
        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}





