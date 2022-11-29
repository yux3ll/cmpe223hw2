package part2;

import part1.Quick;

import java.util.Scanner;

public class Method {

    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        Integer[] hardCoded = {113, 23, 1, 109, 4, 102, 7, 105, 100, 107};
        sortWithChoice(hardCoded, k);
        pairwiseDifference(hardCoded);
    }

    public static void sortWithChoice(Integer[] input, Scanner k){
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
            System.out.println("Enter a valid sorting algorithm");
        }
    }
    public static void pairwiseDifference(Integer[] input){
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
