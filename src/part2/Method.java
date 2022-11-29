package part2;

import java.util.Scanner;

public class Method {
    //-----------------------------------------------------
    // Title: Method
    // Author: Yüksel Çağlar Baypınar
    // ID: 43951623744
    // Section: 02
    // Assignment: 2
    // Description: A driver class with two static methods that take a string input from the user and sorts a pre-determined hard coded integer array
    // in accordance with the user's choice, and then uses a linear comparison to find the smallest pairwise difference within the array, printing the result and the coinciding elements
    //-----------------------------------------------

    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        Integer[] hardCoded = {113, 23, 1, 109, 4, 102, 7, 105, 100, 107}; // pre determined array
        sortWithChoice(hardCoded, k);
        k.close();
        pairwiseDifference(hardCoded);

    }

    public static void sortWithChoice(Integer[] input, Scanner k){ // take user input from scanner and select the proper sorting algorithm using if statements
        System.out.println("Enter the sort you want to use:");
        String method = k.nextLine();
        if(method.equalsIgnoreCase("insertion")){
            Insertion.sort(input);
        } else if (method.equalsIgnoreCase("quick")) {
            Quick.sort(input);
        } else if (method.equalsIgnoreCase("merge")) {
            Merge.sort(input);
        } else if (method.equalsIgnoreCase("selection")) {
            Selection.sort(input);
        } else {
            System.out.println("Enter a valid sorting algorithm"); // exits the program if the input has no correct matches in the library
            System.exit(0);
        }
    }
    public static void pairwiseDifference(Integer[] input){ // a method that iterates through an assumedly sorted array of integers to find the smallest pairwise difference and prints is
    int index = 0;
    int minDif = Math.abs(input[1]-input[0]);
    int minSum = input[0]+input[1];
    for(int i = 1; i< input.length-1;i++){
        int Dif = Math.abs(input[i]-input[i+1]);
        int Sum = input[i]+input[i+1];
        if(Dif<=minDif) {
            if (Dif < minDif) {
                minDif = Dif;
                index = i;
            }
            else if (Sum<minSum){ // used to check when two identical minimum differences are found, selects the one with the smallest sum(sum isn't absolute)
                minDif= Dif;
                index = i;
            }
        }
        }

    System.out.print(minDif + " [" + input[index]+ " " + input[index+1]+ "]");
}

}
