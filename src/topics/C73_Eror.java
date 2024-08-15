package topics;

public class C73_Eror {

    public static void main(String[] args) {
        try {
            infiniteRecursion(1);//StackOverflowError
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

    public static void infiniteRecursion(int i) {
        System.out.println("Recursion depth: " + i);
        infiniteRecursion(i + 1); // Recursive call
    }
}
