import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

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
        // TODO
        Set<String> sortedSet = new TreeSet<>();
        //  for ( String w : words){
        //     sortedSet.add(w);
        //  }
        for ( int i =0; i< words.length; i++){
        sortedSet.add(words[i]);
        }    
        List<String> sortedList = new ArrayList<>();
        for (String word : sortedSet) {
            sortedList.add(word);
        }
        return sortedList;
    }

    public static void main(String[] args) {
        String[] words = {"yes", "no", "maybe", "yes", "yes"};
        List<String> uniqueWords = sortAndRemoveDuplicates(words);
        System.out.println(uniqueWords);
    }
}
