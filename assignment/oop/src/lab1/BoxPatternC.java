package lab1;

import java.util.Scanner;

public class BoxPatternC {
    public static void main(String[] args) {
        //Declare variables
        int size;
        boolean test = false;
        Scanner in = new Scanner(System.in);

        //Send a message for user to make sure they know the input
        do {
            System.out.println("Enter the size (>=1) of the box pattern C: ");
            size = in.nextInt();
            if (size >= 1){
                test = true;
            }
        } while (!test);

        //Print the box pattern C with the size wanted
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || row == size || row == size + 1 - col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");      //Need to print the "leading" blanks
                }
            }
            System.out.println();               //Print a new line after printing all the columns of the previous line
        }
    }
}