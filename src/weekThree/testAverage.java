package weekThree;

import java.util.Scanner;

public class testAverage {
    public static void main(String[] args) {



        int testScore;
        double average;
        Scanner console = new Scanner(System.in);
        System.out.println("How many students are there?");
        int students = console.nextInt();
        System.out.println("How many tests per student?");
        int amount = console.nextInt();

        for (int i =1; i <=students ; i++ ){
            testScore=0;
            System.out.printf("Student number %d:\n",i);
            System.out.println("-".repeat(12));
            for (int j = 0; j < amount; j++){
                System.out.println("Enter score for test:");
                int added = console.nextInt();
                testScore = testScore + added;


            }
            System.out.println("Average test score:");
            System.out.println(testScore/amount);
        }



    }
}
