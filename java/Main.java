package main;
import utils.Utils;
import algorithms.Algorithms;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] A = {1, 5, 2, 7, 99, 0, -5, 66, 4};

        Algorithms.selectionSort(A);
        System.out.print("List: ");
        Utils.printList (A, "\n");
        
        System.out.print("Ingrese elemento a buscar: ");
        int key = sc.nextInt();
        System.out.println("Index: " + Algorithms.binarySearch(A, key, 0, A.length - 1));

    }
}