public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 9, 8, 3};

        int maxElement = findMaximum(array);

        System.out.println("Maximum element in the array: " + maxElement);
    }

    // Method to find the maximum element in the array
    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = array[0]; // Assume the first element as maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}