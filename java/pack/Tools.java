package pack;

public class Tools {

    public static void printList (int[] A) {

        System.out.print("[");

        for (int i = 0; i < A.length; i ++){
            if (i == 0) {
                System.out.print(A[i]);
            }
            else {
                System.out.print(", " + A[i]);
            }
        }
        System.out.println("]");

    }
} 