package us.brandonnelson;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<Thing> items = new ArrayList<>();

        items.add(new Thing("Hammers", 5));
        items.add(new Thing("Puppies", 2));
        items.add(new Thing("Rusty Nails", 233));

        Iterator<Thing> itr = items.iterator();
        while (itr.hasNext()) {
            Thing item = itr.next();
            System.out.println(item.getName());
        }
        // ===================================

        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Mexico", "Mexico City");
        String msg = capitals.get("Mexico"); // get value

        System.out.println(capitals.get(msg));

        String sentence = "Like This is a repetitive sentence Like because it uses words like this, is and repetitive over and over again.";
        String[] words = sentence.toUpperCase(Locale.ROOT).split(" ");
        Map <String, Integer> wordCount = new HashMap <>();

        for (String word: words){
            if (!wordCount.containsKey(word))
                wordCount.put(word, 0);
            wordCount.put(word, wordCount.get(word) + 1);

        }
        for (Map.Entry<String, Integer> entry :
                wordCount.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "," + value);
        }
    }
}