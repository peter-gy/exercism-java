import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Anagram {

    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> words) {
        return words.stream()
                .filter(w -> isAnagram(word, w))
                .collect(Collectors.toList());
    }

    private boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        if (word1.length != word2.length || Arrays.equals(word1, word2)) return false;
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}