package topics;

public class C74_ThrowsTryCatch {

    public static void main(String[] args) {


        printNumbers(5);


    }

    // Method to print numbers from a given starting number up to 100
    public static void printNumbers(int start) {
        for (int i = start; i <= 100; i++) {
            System.out.println(i); // Print the current number
            // Add a delay for readability in the console
            try {
                Thread.sleep(100); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
