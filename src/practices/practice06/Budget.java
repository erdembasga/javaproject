package practices.practice06;

public class Budget {
    static int familyBudget = 500;
    int allowance = 100;

    public void spendAllowance(int money){
        if (money<=allowance){
            allowance = allowance - money;// allowance -= money;
        }else {
            System.err.println("You don't have enough money to spend from your allowance");
        }

    }

    public void earnMoney(int money){
        allowance += money;
    }

    public static void spendFamilyBudget(int money){
        if (money<=familyBudget){
            familyBudget -= money;
        }else {
            System.err.println("Family budget doesn't have enough money");
        }

    }

    public static void increaseFamilyBudget(int money){
        familyBudget += money;
    }

}
