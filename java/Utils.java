package utils;

public class Utils {

    public static void printList (int[] A, String end) {

        System.out.print("[");

        for (int i = 0; i < A.length; i ++){
            if (i == 0) {
                System.out.print(A[i]);
            }
            else {
                System.out.print(", " + A[i]);
            }
        }
        System.out.print("]");
        System.out.print(end);
    }
}
