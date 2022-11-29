package part1and2;

import java.util.Scanner;

public class Method {
    //create a static method that runs different sorting algorithms depending on a parameter(taken as string)
    //once sorted, it looks at the array and finds the smallest pairwise difference(absolute value)
    //returns nothing and prints the value in the console alongisde the pair itself
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
       // hard coded input
       //input based sorting method
    }

    public static void pairwiseDifference(int[] input){
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
            else if (Sum<minSum){
                minDif= Dif;
                index = i;
            }
        }
        }

    System.out.print("Output: " + minDif + " [" + input[index]+ " " + input[index+1]+ "]");
}

}
