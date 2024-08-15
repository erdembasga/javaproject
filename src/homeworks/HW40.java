package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class HW40 {
    //40: Write a program for the daily income of a grocery store.
/*
 - A method that shows the income for all days,
 - A method that shows the average weekly income,
 - A method that shows which days have income higher than the average,
 - A method that shows which days have income less than the average,
 - A method that shows which days have income equal to the average.
*/

    static ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    static ArrayList<Integer> incomes = new ArrayList<>(Arrays.asList(40, 50, 30, 60, 50, 70, 50));

    public static void main(String[] args) {

        System.out.println(incomeForAllDays());
        System.out.printf("%.2f",average());
        System.out.println("\n"+incomesHigherThanTheAverage());
        System.out.println(incomesLessThanTheAverage());
        System.out.println("incomesEqualsToAverage = " + incomesEqualsToAverage());



    }

    public static String incomeForAllDays(){

        String dayAndIncome = "";

        for (int i=0; i<days.size(); i++ ){

            dayAndIncome += days.get(i)+incomes.get(i);


        }

        return dayAndIncome;

    }

    public static double average(){

        int sum = 0;
        for (int w : incomes){
            sum += w;
        }

        return (double) sum/incomes.size();
    }

    public static String incomesHigherThanTheAverage(){
        String result = "";

        for (int i=0; i<days.size(); i++){
            if (incomes.get(i)>average()){
                result += days.get(i)+" ";
            }
        }

        return result;
    }
    public static String incomesLessThanTheAverage(){
        String result = "";

        for (int i=0; i<days.size(); i++){
            if (incomes.get(i)<average()){
                result += days.get(i)+" ";
            }
        }

        return result;
    }
    public static String incomesEqualsToAverage(){
        String result = "";

        for (int i=0; i<days.size(); i++){
            if (incomes.get(i)==average()){
                result += days.get(i)+" ";
            }
        }

        return result;
    }


}
