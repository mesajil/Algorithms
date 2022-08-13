package algorithms;

public class Sorting {

    public static void InsertionSort () {

        int key;
        int[] array = {2,3,5,1,4,0};

        System.out.print("Insertion sort: ");

        for (int i = 1; i < array.length; i ++) {
            key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j --;
            }
            array[j + 1] = key;
        }
    
        for (int e: array) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
    public static void BubbleSort () {

        int key, temp;
        int[] array = {2,3,5,1,4,0};

        System.out.print("Bubble sort: ");

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array.length - i - 1; j ++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    
        for (int e: array) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        
        Sorting.InsertionSort();
        Sorting.BubbleSort();

    }
}