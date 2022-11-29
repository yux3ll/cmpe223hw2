package part1and2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

        System.out.println("Input filename: ");
        String fileName = k.nextLine();

        k.close();

        try {
            Scanner input = new Scanner(new File(fileName));
           Double[] numbers = fileReaderDouble(input);
            // Integer[] numbers = fileReaderInt(input);
            //Merge.sortDescend(numbers);
            Quick.sortDescend(numbers);
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    Route[] test = new Route[10];
    test[0] = new Route("Ankara", "Antalya");
    test[1] = new Route("Ankara", "Istanbul");
    test[2] = new Route("Istanbul", "Antalya");
    test[3] = new Route("Antalya", "Izmir");
    test[4] = new Route("Izmir", "Antalya");
    test[5] = new Route("Izmir", "Ankara");
    test[6] = new Route("Antalya", "Ankara");
    test[7] = new Route("Ankara", "Izmir");
    test[8] = new Route("Istabul", "Izmir");
    test[9] = new Route("Istanbul", "Ankara");


    System.out.println();
    }


    static Double[] fileReaderDouble(Scanner input){      // reads a file into int array from given directory, uses first line as size
        Double[] values = new Double[input.nextInt()];
        int i=0;
        while(input.hasNext()){
            values[i]=input.nextDouble();
            i++;
        }
        return values;
    }


    static Integer[] fileReaderInt(Scanner input){      // reads a file into int array from given directory, uses first line as size
        Integer[] values = new Integer[input.nextInt()];
        int i=0;
        while(input.hasNext()){
           values[i]=input.nextInt();
           i++;
        }
   return values;
    }

}
