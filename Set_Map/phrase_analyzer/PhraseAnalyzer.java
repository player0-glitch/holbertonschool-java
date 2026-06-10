import java.util.TreeMap;

public class PhraseAnalyzer {

  public static TreeMap<String, Integer> wordCount(String sentence) {
    TreeMap<String, Integer> countMap = new TreeMap<>();

    if (sentence == null || sentence.trim().isEmpty()) {
      return countMap;
    }

    String cleanedSentence = sentence.toLowerCase();
    cleanedSentence = cleanedSentence.replaceAll("[?.!]", "");

    String[] words = cleanedSentence.split("\\s+");

    for (String word : words) {
      if (!word.isEmpty()) {
        countMap.put(word, countMap.getOrDefault(word, 0) + 1);
      }
    }

    return countMap;
  }
}
