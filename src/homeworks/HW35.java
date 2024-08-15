package homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class HW35 {
    //35: Take as many grades as the teacher wants to input and find the number of students above the average.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> gradesList = new ArrayList<>();

        while (true){
            System.out.println("Enter the grade:");
            gradesList.add(scanner.nextInt());
            System.out.println("Continue: Y/N");
            if (scanner.next().equalsIgnoreCase("N")){
                break;
            }

        }

        System.out.println(gradesList);

        double sum = 0;
        for (int w : gradesList) {
            sum+=w;
        }

        double average = sum / gradesList.size();
        System.out.println("average = " + average);

        int counter = 0;
        for (int w : gradesList){
            if (w>average){
                counter++;
            }
        }

        System.out.println("There are " + counter + "students above average.");


    }
}
