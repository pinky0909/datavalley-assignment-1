import java.util.Arrays;

public class ArraySortAndOccurrence {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 2, 9, 8, 2, 3};
        int numberToFind = 2;

        // Sort the array
        Arrays.sort(array);

        // Count occurrences of a particular number
        int occurrenceCount = countOccurrences(array, numberToFind);

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrenceCount);
    }

    // Method to count occurrences of a number in the array
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }
}