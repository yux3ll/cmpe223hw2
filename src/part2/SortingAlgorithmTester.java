package part2;
import part1.Quick;

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
    .
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a seed to create random generated values:");
        int seed =k.nextInt();
        System.out.println("Seed : " + seed);
        Random random = new Random(seed);
        Integer[] values1random = randomArrayGenerator(random,250);
        Integer[] values2random = randomArrayGenerator(random,1000);
        Integer[] values3random = randomArrayGenerator(random,4000);
        Integer[] values4random = randomArrayGenerator(random,16000);
        Integer[] values5random = randomArrayGenerator(random,64000);

        Long[] selectionRandom = new Long[3];
        Long[] selectionAscend = new Long[3];
        Long[] selectionDescend = new Long[3];
        Long[] insertionRandom = new Long[3];
        Long[] insertionAscend = new Long[3];
        Long[] insertionDescend = new Long[3];
        Long[] mergeRandom = new Long[3];
        Long[] mergeAscend = new Long[3];
        Long[] mergeDescend = new Long[3];
        Long[] quickRandom = new Long[3];
        Long[] quickAscend = new Long[3];
        Long[] quickDescend = new Long[3];

        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }
        Quick.sort(values1random);
        for(int i=0;i<3; i++){
            selectionAscend[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }
        reverser(values1random, values1random.length);
        for(int i=0;i<3; i++){
            selectionDescend[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }

        for(int i=0;i<3; i++){
            insertionRandom[i]=testAndPreserve(values1random,"Insertion");
            System.out.println();
        }
        Quick.sort(values1random);
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }
        reverser(values1random, values1random.length);
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }

        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }
        Quick.sort(values1random);
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }
        reverser(values1random, values1random.length);
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values1random,"Selection");
            System.out.println();
        }






    }



    public static Integer[] randomArrayGenerator(Random random, int size){
        Integer[] values = new Integer[size];
        for(int i=0;i<size;i++){
            values[i] = random.nextInt();
        }
        return values;
    }


    public static long testAndPreserve(Integer[] input, String choice){
        Integer[] temp = new Integer[input.length];
        System.arraycopy(input,0, temp,0,input.length);
        long time = System.currentTimeMillis();
        Method.method(temp, choice);
        return System.currentTimeMillis()-time;
    }

    public static void reverser(Integer[] a, int n){
        n= a.length;
        int i, k, t;
            for (i = 0; i < n / 2; i++) {
                t = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = t;
            }
    }
}
