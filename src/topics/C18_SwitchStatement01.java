package topics;

public class C18_SwitchStatement01 {
    public static void main(String[] args) {

        String fruit = "Orange";
        String type;

        switch (fruit){
            case "Apple":
                type = "It is a red fruit.";
                break;
            case "Banana":
                type = "It is a yellow fruit.";
                break;
            case "Orange":
                type = "It is a orange fruit.";
                break;
            default:
                type = "Unknown fruit.";
                break;

        }

        System.out.println(type);





    }
}
