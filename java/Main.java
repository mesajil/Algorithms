package main;
import utils.Utils;
import algorithms.Algorithms;


public class Main {
    public static void main (String[] args) {
        int[] A = {1, 5, 2, 7, 99, 0, -5, 66, 4};
        Algorithms.insertionSort(A);
        Utils.printList (A, "\n");
        System.out.println(Algorithms.linearSearch(A, Integer.parseInt(args[0])));

    }
}