package basics.programs.array;

// Java Program to print the duplicate elements of an array

import java.util.Arrays;

public class FindDuplicates extends BaseClass {

    public static void main(String args[]) {

        int[] arr = {1, 2, 4, 7, 2, 1, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Duplicate elements are: ");

        // This array will mark elements that have already been processed as duplicates
        int[] visitedMarkers = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            // If this element was already identified as a duplicate of a previous element, skip it.
            if (visitedMarkers[i] == visited) {
                continue;
            }

            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    // Mark the found duplicate so it won't be processed as a primary element later.
                    visitedMarkers[j] = visited;
                }
            }
            // If, after checking all other elements, we found at least one duplicate of arr[i], print it.
            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
