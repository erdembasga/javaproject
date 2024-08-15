package practices.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q03_Map_FirstLastname {
    /*
    Write a code that prints names and surnames stored at the same index in two different arrays, as shown in the example.
        input : {"John", "Jane", "Michael"}; {"Smith", "Doe", "Johnson"};
        output : {John=Smith, Jane=Doe, Michael=Johnson};
*/

    public static void main(String[] args) {
        String[] firstnames = {"John", "Jane", "Michael"};
        String[] lastnames = {"Smith", "Doe", "Johnson"};
        Map<String, String> fullname = new HashMap<>();

        for (int i = 0; i < firstnames.length; i++) {
            String firstname = firstnames[i];
            String lastname = lastnames[i];
            fullname.put(firstname, lastname);
        }

        System.out.println(fullname);

    }
}
