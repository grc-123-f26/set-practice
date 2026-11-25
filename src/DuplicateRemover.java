import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * The DuplicateRemover class provides a method to remove duplicate words
 * from an array of strings and return a sorted list of unique words.
 */
public class DuplicateRemover {

    /**
     * Removes duplicate words from the input array, sorts them in lexicographic order,
     * and returns a list of unique words.
     *
     * @param words an array of strings that may contain duplicate words
     * @return a sorted List<String> containing unique words from the input array
     */
    public static List<String> sortAndRemoveDuplicates(String[] words) {
        // DIY Method
        // List<String> output = new ArrayList<>();
        // for (String string : words) {
        //     if (!output.contains(string)) {
        //         output.add(string);  
        //     }
        // }
        // output.sort(null);

        //In-class Method
        Set<String> outSet = new TreeSet<>();
        for (String string : words) {
            outSet.add(string);
        }
        List<String> output = new ArrayList<>();
        for (String string : outSet) {
            output.add(string);
        }
        return output;
    }

    public static void main(String[] args) {
        String[] words = {"yes", "no", "maybe", "yes", "yes"};
        List<String> uniqueWords = sortAndRemoveDuplicates(words);
        System.out.println(uniqueWords);
    }
}
