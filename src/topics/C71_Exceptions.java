package topics;

import java.io.*;

public class C71_Exceptions {

    public static void main(String[] args) throws IOException {

//        int number = 4/0;// ArithmeticException: // by zero
//        System.out.println("number = " + number);

//        String str = null;
//        str.trim();//NullPointerException

//        int[] arr = {1,2,3};
//        System.out.println("arr[5] = " + arr[5]);//ArrayIndexOutOfBoundsException

        File file = new File("xyz.txt");
        FileInputStream fileInputStream = new FileInputStream(file);//FileNotFoundException

        BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
        String line = bufferedReader.readLine();



    }

}
