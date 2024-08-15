package topics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C77_ReadFile {

    public static void main(String[] args) throws IOException {

        String filePath = "TextFile.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line1 = bufferedReader.readLine();
        System.out.println(line1);





    }
}
