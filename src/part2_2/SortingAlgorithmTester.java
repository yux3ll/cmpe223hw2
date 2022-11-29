package part2_2;

import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithmTester {
//-----------------------------------------------------
    // Title: SortingAlgorithmTester(vpl version)
    // Author: Yüksel Çağlar Baypınar
    // ID: 43951623744
    // Section: 02
    // Assignment: 2
    // Description: A class with a main method that takes one integer input from the user to create a random array of varying sizes
    // in order to compare the time complexities of different sorting algorithms.
    //-----------------------------------------------

    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a seed to create random generated values:");
        int seed =k.nextInt();
        System.out.println("Seed: " + seed);
        Random random = new Random(seed);

    }


}
