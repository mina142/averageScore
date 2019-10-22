
/*A program is needed to prompt the user operator for ten exam scores,
calculate the average score and display the result to the screen.
The average score is
calculated as the sum of the scores divided by the number of scores.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double[] vars = new double[10];
        double finalResult = 0, sum = 0;
        Scanner key = new Scanner(System.in);

        for(int i = 0; i < vars.length; i++){
            System.out.println("please enter a grade: ");
            vars[i] = key.nextDouble();
            sum = sum + vars[i];
            finalResult = sum /10; 
            
        }
        System.out.println(" Average numbers is: " + finalResult);
    }
}
