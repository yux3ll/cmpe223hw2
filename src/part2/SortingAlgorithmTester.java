package part2;
import part1.Quick;

import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithmTester {
//-----------------------------------------------------
    // Title: SortingAlgorithmTester
    // Author: Yüksel Çağlar Baypınar
    // ID: 43951623744
    // Section: 02
    // Assignment: 2
    // Description: An absolutely horrible class with a main method that takes one integer input from the user to create a random array of varying sizes
    // in order to compare the time complexities of different sorting algorithms. An epiphany of redundant code and lack of clear direction
    //I am truly sorry for whoever is reading this like genuinely i'm sorry...
    //-----------------------------------------------

    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a seed to create random generated values:");
        int seed =k.nextInt();
        System.out.println("Seed : " + seed);
        Random random = new Random(seed);
        Integer[] values1random = randomArrayGenerator(random,100000);
        Integer[] values2random = randomArrayGenerator(random,9000);
        Integer[] values3random = randomArrayGenerator(random,20000);
        Integer[] values4random = randomArrayGenerator(random,50000);
        Integer[] values5random = randomArrayGenerator(random,10000);

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
            selectionRandom[i]=testAndPreserve(values1random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionRandom[i]=testAndPreserve(values1random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeRandom[i]=testAndPreserve(values1random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickRandom[i]=testAndPreserve(values1random,"quick");
            System.out.println();
        }
        Quick.sort(values1random);
        for(int i=0;i<3; i++){
            selectionAscend[i]=testAndPreserve(values1random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionAscend[i]=testAndPreserve(values1random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeAscend[i]=testAndPreserve(values1random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickAscend[i]=testAndPreserve(values1random,"quick");
            System.out.println();
        }
        reverser(values1random, values1random.length);
        for(int i=0;i<3; i++){
            selectionDescend[i]=testAndPreserve(values1random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionDescend[i]=testAndPreserve(values1random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeDescend[i]=testAndPreserve(values1random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickDescend[i]=testAndPreserve(values1random,"quick");
            System.out.println();
        }

      System.out.println();
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values2random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionRandom[i]=testAndPreserve(values2random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeRandom[i]=testAndPreserve(values2random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickRandom[i]=testAndPreserve(values2random,"quick");
            System.out.println();
        }
        Quick.sort(values2random);
        for(int i=0;i<3; i++){
            selectionAscend[i]=testAndPreserve(values2random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionAscend[i]=testAndPreserve(values2random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeAscend[i]=testAndPreserve(values2random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickAscend[i]=testAndPreserve(values2random,"quick");
            System.out.println();
        }
        reverser(values2random, values2random.length);
        for(int i=0;i<3; i++){
            selectionDescend[i]=testAndPreserve(values2random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionDescend[i]=testAndPreserve(values2random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeDescend[i]=testAndPreserve(values2random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickDescend[i]=testAndPreserve(values2random,"quick");
            System.out.println();
        }

        System.out.println();
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values3random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionRandom[i]=testAndPreserve(values3random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeRandom[i]=testAndPreserve(values3random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickRandom[i]=testAndPreserve(values3random,"quick");
            System.out.println();
        }
        Quick.sort(values3random);
        for(int i=0;i<3; i++){
            selectionAscend[i]=testAndPreserve(values3random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionAscend[i]=testAndPreserve(values3random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeAscend[i]=testAndPreserve(values3random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickAscend[i]=testAndPreserve(values3random,"quick");
            System.out.println();
        }
        reverser(values3random, values3random.length);
        for(int i=0;i<3; i++){
            selectionDescend[i]=testAndPreserve(values3random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionDescend[i]=testAndPreserve(values3random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeDescend[i]=testAndPreserve(values3random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickDescend[i]=testAndPreserve(values3random,"quick");
            System.out.println();
        }
        System.out.println();
//values 4
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values4random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionRandom[i]=testAndPreserve(values4random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeRandom[i]=testAndPreserve(values4random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickRandom[i]=testAndPreserve(values4random,"quick");
            System.out.println();
        }
        Quick.sort(values4random);
        for(int i=0;i<3; i++){
            selectionAscend[i]=testAndPreserve(values4random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionAscend[i]=testAndPreserve(values4random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeAscend[i]=testAndPreserve(values4random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickAscend[i]=testAndPreserve(values4random,"quick");
            System.out.println();
        }
        reverser(values4random, values4random.length);
        for(int i=0;i<3; i++){
            selectionDescend[i]=testAndPreserve(values4random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionDescend[i]=testAndPreserve(values4random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeDescend[i]=testAndPreserve(values4random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickDescend[i]=testAndPreserve(values4random,"quick");
            System.out.println();
        }
        System.out.println();
        // values 5
        for(int i=0;i<3; i++){
            selectionRandom[i]=testAndPreserve(values5random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionRandom[i]=testAndPreserve(values5random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeRandom[i]=testAndPreserve(values5random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickRandom[i]=testAndPreserve(values5random,"quick");
            System.out.println();
        }
        Quick.sort(values5random);
        for(int i=0;i<3; i++){
            selectionAscend[i]=testAndPreserve(values5random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionAscend[i]=testAndPreserve(values5random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeAscend[i]=testAndPreserve(values5random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickAscend[i]=testAndPreserve(values5random,"quick");
            System.out.println();
        }
        reverser(values5random, values5random.length);
        for(int i=0;i<3; i++){
            selectionDescend[i]=testAndPreserve(values5random,"selection");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            insertionDescend[i]=testAndPreserve(values5random,"insertion");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            mergeDescend[i]=testAndPreserve(values5random,"merge");
            System.out.println();
        }
        for(int i=0;i<3; i++){
            quickDescend[i]=testAndPreserve(values5random,"quick");
            System.out.println();
        }
        System.out.println();
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
