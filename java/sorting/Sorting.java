package sorting;
import pack.Tools;

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
        System.out.println("Insertion sort work flow: ");
        System.out.print ("\nUnsorted list: ");
        Tools.printList (A, "\n");
        
        for (int i = 1; i < A.length; i ++) {
            key = A[i];
            int j = i - 1;

            System.out.println("\nCycle i: " + i);
            System.out.println("key: " + key);
            Tools.printList (A, " - key at index " + i + " ?\n");

            while (j >= 0 && key < A[j]) {
                A[j + 1] = A[j];
                j --;

                A[j + 1] = key; // Not necessary, but to watch how it works
                Tools.printList (A, " - key at index " + (j + 1) + " ?\n");
            }
            // A[j + 1] = key; // Original
        }
        System.out.print ("\nSorted list: ");
        Tools.printList (A, "\n");
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