package homeworks;

public class Division extends Operation {

    @Override
    int calculate(int a, int b) {

        if (b==0){
            System.out.println("Can not divide by zero");
        }

        return a/b;
    }
}
