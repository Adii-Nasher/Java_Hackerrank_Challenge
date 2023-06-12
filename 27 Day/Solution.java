import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution {

    public static int findMinimumIndex(int[] sequence) {
        if (sequence.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int minimumIndex = 0;
        for (int currentIndex = 1; currentIndex < sequence.length; ++currentIndex) {
            if (sequence[currentIndex] < sequence[minimumIndex]) {
                minimumIndex = currentIndex;
            }
        }
        return minimumIndex;
    }

    static class TestDataEmptyArray {
        public static int[] getArray() {
            int[] emptyArray = {};
            return emptyArray;
        }
    }

    static class TestDataUniqueValues {
        public static int[] getArray() {
            int[] uniqueValuesArray = {1, 2, 3, 4, 5};
            return uniqueValuesArray;
        }

        public static int getExpectedResult() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] getArray() {
            int[] arrayWithTwoMinimums = {1, 3, 1};
            return arrayWithTwoMinimums;
        }

        public static int getExpectedResult() {
            return 0;
        }
    }

    public static void testWithEmptyArray() {
        try {
            int[] sequence = TestDataEmptyArray.getArray();
            int result = findMinimumIndex(sequence);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void testWithUniqueValues() {
        int[] sequence = TestDataUniqueValues.getArray();
        if (sequence.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] integerSequence = new Integer[sequence.length];
        for (int i = 0; i < sequence.length; ++i) {
            integerSequence[i] = Integer.valueOf(sequence[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(integerSequence))).size() == sequence.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expectedResult = TestDataUniqueValues.getExpectedResult();
        int result = findMinimumIndex(sequence);
        if (result != expectedResult) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void testWithExactlyTwoDifferentMinimums() {
        int[] sequence = TestDataExactlyTwoDifferentMinimums.getArray();
        if (sequence.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmperorary = sequence.clone();
        Arrays.sort(tmperorary);
        if (!(tmperorary[0] == tmperorary[1] && (tmperorary.length == 2 || tmperorary[1] < tmperorary[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expectedResult = TestDataExactlyTwoDifferentMinimums.getExpectedResult();
        int result = findMinimumIndex(sequence);
        if (result != expectedResult) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        testWithEmptyArray();
        testWithUniqueValues();
        testWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}

