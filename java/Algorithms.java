package algorithms;
import utils.Utils;

public class Algorithms {

    public static void insertionSort (int[] A) {

        int key;

        for (int i = 1; i < A.length; i ++) {
            key = A[i];
            int j = i - 1;

            while (j >= 0 && key < A[j]) {
                A[j + 1] = A[j];
                j --;
            }
            A[j + 1] = key;
        }
    }
    public static void insertionSortWorkFlow (int[] A) {

        int key;
        System.out.println("Insertion sort work flow: "); // Title
        
        for (int i = 1; i < A.length; i ++) {
            key = A[i];
            int j = i - 1;

            System.out.println("\nCycle " + i); // Cycle number
            System.out.println("key " + key + " at index " + i); // Selecting key
            Utils.printList (A, " - key at index " + i + " ?\n"); // Before it loops

            while (j >= 0 && key < A[j]) {
                A[j + 1] = A[j];
                j --;

                A[j + 1] = key; // How it works while looping
                Utils.printList (A, " - key at index " + (j + 1) + " ?\n"); // While it looping
            }
            // A[j + 1] = key; // Original place
        }
    }

    public static void bubbleSort (int[] A) {

        int temp, counter;

        for (int i = 0; i < A.length - 1; i ++) {

            counter = 0; // Reset counter of swaps.
            
            for (int j = 0; j < A.length - i - 1; j ++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    counter ++;
                }
            }
            if (counter == 0) break;
        }
    }
    public static void bubbleSortWorkFlow (int[] A) {

        int temp, counter;

        for (int i = 0; i < A.length - 1; i ++) {

            System.out.println("\nCycle i = " + i); // Cycle number
            System.out.print("Initial: "); // Cycle number
            Utils.printList (A, "\n");

            counter = 0; // Reset counter of swaps.

            for (int j = 0; j < A.length - i - 1; j ++) {
                
                System.out.println("\n-> j = " + j); // Cycle number
                
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    counter ++;

                    System.out.println(" Swapping " + A[j + 1] + " and " + A[j]);
                    Utils.printList (A, "\n");
                }
            }
            System.out.println("\nIt got " + counter + " swaps.");
            if (counter == 0) break;
        }
    }

    public static int linearSearch(int[] A, int key) {
        
        for (int i = 0; i < A.length; i ++) {
            if (A[i] == key)
                return i;
        }
        return -1;
    }

}