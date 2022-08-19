package sorting;
import utils.Utils;

public class Sorting {

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

                A[j + 1] = key; // Not original
                Utils.printList (A, " - key at index " + (j + 1) + " ?\n"); // While it looping
            }
            // A[j + 1] = key; // Original
        }
    }

    public static void bubbleSort () {

        int key, temp;
        int[] A = {2,3,5,1,4,0};

        System.out.print("Bubble sort: ");

        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < A.length - i - 1; j ++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    
        for (int e: A) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

}