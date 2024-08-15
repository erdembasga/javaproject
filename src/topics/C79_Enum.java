package topics;

import another_package.Month;

public class C79_Enum {
    public static void main(String[] args) {

        Month january = Month.JANUARY;
        System.out.println(january.getMonthName());
        System.out.println(january.getFavoriteFruit());
        System.out.println(january.getFavoriteVegetable());

        System.out.println("=====================");

        Month[] months = Month.values();

        for (Month w : months){
            System.out.println(w.getMonthName());
            System.out.println(w.getFavoriteFruit());
            System.out.println(w.getFavoriteVegetable());
            System.out.println("--");
        }



    }
}
