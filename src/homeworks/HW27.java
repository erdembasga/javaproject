package homeworks;

import java.util.ArrayList;

public class HW27 {
    //27: Write code that adds the elements common to two arrays to a separate list.   (without case sensitivity)
    /*
      Input1:       String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                    String[] brr = {"sofia","brad","grace","emily","hazel"};

      Output: [brad, sofia, emily]
     */

    public static void main(String[] args) {

        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};
        ArrayList<String> commonElements = new ArrayList<>();

        for (String w : arr) {

            for (String u : brr) {

                if (w.equalsIgnoreCase(u)) {
                    commonElements.add(w);
                }
            }
        }

        System.out.println("commonElements = " + commonElements);

    }
}
