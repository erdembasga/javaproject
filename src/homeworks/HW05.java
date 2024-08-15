package homeworks;

public class HW05 {
    //05: Explain what is wrong with the following code and provide a corrected version.
    public static void main(String[] args) {
        int number = 10;
        String text = "15";
        number = Integer.parseInt(text);

        System.out.println("number = " + number);
    }
}
