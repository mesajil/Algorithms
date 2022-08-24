package main;
import utils.Utils;
import algorithms.Algorithms;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] A = {1, 5, 2, 7, 99, 0, -5, 66, 4};

        Algorithms.bubbleSort(A);
        System.out.print("List: ");
        Utils.printList (A, "\n");
        
        System.out.print("Ingrese elemento a buscar: ");
        int key = sc.nextInt();
        System.out.println("Index: " + Algorithms.linearSearch(A, key));

    }
}