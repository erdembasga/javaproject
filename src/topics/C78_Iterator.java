package topics;

import java.util.ArrayList;
import java.util.Iterator;

public class C78_Iterator {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            int number = iterator.next();
            if (number%2==0){
                iterator.remove();
            }
        }

        System.out.println(numbers);

    }
}
