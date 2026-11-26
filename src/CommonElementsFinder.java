import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Map<Integer, Integer> numberFrequencies = new HashMap<>();

        if (array1.length > array2.length) {
            for (int num : array1) {
                numberFrequencies.put(num, numberFrequencies.get(num) + 1);
            }
        }

        if (array2.length > array1.length) {
            for (int num : array2) {
                numberFrequencies.put(num, numberFrequencies.get(num) + 1);
            }
        }

        Set<Integer> commonNums = new HashSet<>();
        for (int num : numberFrequencies.keySet()) {
            if (numberFrequencies.get(num) > 1) {
                commonNums.add(num);
            }
        }

        return commonNums;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
