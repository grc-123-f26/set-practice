import java.util.Map;
import java.util.HashMap;

/**
 * The UniqueCharacterChecker class provides a method to check if all characters
 * in a given word are unique.
 */
public class UniqueCharacterChecker {

    /**
     * Checks if a given word has all unique characters.
     *
     * @param word the string to be checked for unique characters
     * @return true if all characters in the word are unique; false otherwise
     */
    public static boolean hasUniqueCharacters(String word) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char character : word.toCharArray()) {
            if (charFrequency.get(character) == null) {
                charFrequency.put(character, 1);
            } else {
                charFrequency.put(character, charFrequency.get(character) + 1);
            }
        }

        for (char character : charFrequency.keySet()) {
            if (charFrequency.get(character) > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";
        String word3 = "abcdefg";

        System.out.println(word1 + " has unique characters: " + hasUniqueCharacters(word1));
        System.out.println(word2 + " has unique characters: " + hasUniqueCharacters(word2));
        System.out.println(word3 + " has unique characters: " + hasUniqueCharacters(word3));
    }
}
