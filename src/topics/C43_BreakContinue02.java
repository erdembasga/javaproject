package topics;

public class C43_BreakContinue02 {
    public static void main(String[] args) {

        String str = "Hello World! How are you? We love Java.";
        String consonants = "";

        for (int i=0; i<str.length(); i++){

            String c = str.charAt(i) + "";

            if ("aeiouAEIOU".contains(c)){
                continue;
            } else if (c.equals("?")){
                break;
            }

            consonants +=  c ;

        }

        System.out.println(consonants);





    }
}
