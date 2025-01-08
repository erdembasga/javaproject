package Deneme;

public class D24 {
    public static void main(String[] args) {
    /* create a method that will take a string parametre will
     the return all values of string as lowercase
     HaSAn  =>  hasan
     */
    String name = "HAsAn";





    System.out.println(upperCase(LowerCase(name)));



//        System.out.println(LowerCase(name));
//
//        String updatedName = "hasan";
//        System.out.println(upperCase(updatedName));
    }

    public static String LowerCase(String name){
        String temp = "";//hasan

        for (int i = 0; i < name.length(); i++) {
           temp += name.substring(i,i+1).toLowerCase();
        }
        return temp;
    }

    public static String upperCase(String name){
        return name.substring(0,1).toUpperCase()+name.substring(1);
    }
}
