package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);

        System.out.println("Input filename: ");
        String fileName = k.nextLine();

        k.close();

        try {
            Scanner input = new Scanner(new File(fileName));
            Integer[] numbers = fileReaderInt(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }




    static Integer[] fileReaderInt(Scanner input){
        Integer[] values = new Integer[input.nextInt()];
        int i=0;
        while(input.hasNext()){
           values[i]=input.nextInt();
           i++;
        }
   return values;
    }

}
