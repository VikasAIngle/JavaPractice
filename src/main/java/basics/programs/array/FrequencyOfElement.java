package basics.programs.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement extends BaseClass {

    public static void main(String args[]) {

        // --- 1. Get User Input ---
        System.out.println("Enter the no of array elements:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        String arr[] = new String[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine().trim();
        }
        System.out.println("Given Array is: " + Arrays.toString(arr));
        System.out.println("-------------------------");

        // --- 2. Calculate and Print Frequencies ---
        int[] freqArr = new int[n];
        int visitedMarker = -1; // A value to mark elements that have been counted

        for (int i = 0; i < n; i++) {
            // If this element has already been counted, skip it
            if (freqArr[i] == visitedMarker) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                    // Mark the duplicate element as visited so we don't count it again
                    freqArr[j] = visitedMarker;
                }
            }
            // After the inner loop, 'count' holds the total frequency of arr[i]
            System.out.println("Frequency of '" + arr[i] + "' is " + count);
        }
        // Optional: Print the final state of the marker array for debugging
        System.out.println("Final Marker Array: " + Arrays.toString(freqArr));

        System.out.println("<-----USING HASHMAP----->");
        usingHashMap(arr);

    }

    public static void usingHashMap(String[] arr) {
        
        Map<String, Integer> freqMap = new HashMap<>();

        for (String ele : arr) {
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }

        for (String s : freqMap.keySet()) {
            System.out.println("Element: " + s + " Frequency: " + freqMap.get(s));
        }
    }
}
