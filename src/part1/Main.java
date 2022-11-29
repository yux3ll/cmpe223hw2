package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {
           Scanner input = new Scanner(new File("src/integers.txt"));
           Integer[] integers = fileReaderInt(input);
           Integer[] duplicate= new Integer[integers.length];
            input.close();
            System.arraycopy(integers, 0, duplicate, 0, integers.length);

           System.out.println("Integers are reading from the integers.txt file, the array is:");
           objectPrinter(integers);
           System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
           Insertion.sort(integers);
           objectPrinter(integers);
           System.out.println("Step 1 has been completed. \n ");

           System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
           Insertion.sortDescend(integers);
           objectPrinter(integers);
           System.out.println("Step 2 has been completed. \n ");

           Scanner newInput = new Scanner(new File("src/doubles.txt"));
           Double[] doubles = fileReaderDouble(newInput);
           newInput.close();
           System.out.println("Doubles are reading from the doubles.txt file, the array is:");
           objectPrinter(doubles);
           System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");
           Insertion.sort(doubles);
           objectPrinter(doubles);
           System.out.println("Step 3 has been completed. \n");

           System.out.println("The original array is:");
           objectPrinter(duplicate);
           System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
           Merge.sortDescend(duplicate);
           objectPrinter(duplicate);
           System.out.println("Step 4 has been completed. \n");

           Route[] lotsOfWays = new Route[10];
           lotsOfWays[0] = new Route("Ankara", "Antalya");
           lotsOfWays[1] = new Route("Ankara", "Istanbul");
           lotsOfWays[2] = new Route("Istanbul", "Antalya");
           lotsOfWays[3] = new Route("Antalya", "Izmir");
           lotsOfWays[4] = new Route("Izmir", "Antalya");
           lotsOfWays[5] = new Route("Izmir", "Ankara");
           lotsOfWays[6] = new Route("Antalya", "Ankara");
           lotsOfWays[7] = new Route("Ankara", "Izmir");
           lotsOfWays[8] = new Route("Istanbul", "Izmir");
           lotsOfWays[9] = new Route("Istanbul", "Ankara");

           Quick.sort(lotsOfWays);
           objectPrinterLine(lotsOfWays);
           System.out.println("Step 6 has been completed.");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }





    }


    static Double[] fileReaderDouble(Scanner input){      // reads a file into int array from given directory, uses first line as size
        Double[] values = new Double[input.nextInt()+1];
        values[0]=(double) values.length-1;
        int i=1;
        while(input.hasNext()){
            values[i]=input.nextDouble();
            i++;
        }
        return values;
    }

    static Integer[] fileReaderInt(Scanner input){      // reads a file into int array from given directory, uses first line as size
        Integer[] values = new Integer[input.nextInt()+1];
        values[0]=values.length-1;
        int i=1;
        while(input.hasNext()){
           values[i]=input.nextInt();
           i++;
        }
   return values;
    }
    public static void objectPrinterLine(Object[] input){
        for (Object o : input) {
            System.out.println(o);
        } }

    public static void objectPrinter(Object[] input){
        for (Object o : input) {
            System.out.print(o + " ");
        }
    System.out.println();
    }

}
