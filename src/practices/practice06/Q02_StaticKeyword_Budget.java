package practices.practice06;

public class Q02_StaticKeyword_Budget {
    // Write a simple household budget code.

    public static void main(String[] args) {

        Budget father = new Budget();
        father.spendAllowance(10);

        Budget mother = new Budget();
        mother.spendAllowance(60);

        Budget son = new Budget();
        son.earnMoney(44);
        son.spendAllowance(140);
        son.spendAllowance(50);

        Budget.spendFamilyBudget(200);
        Budget.spendFamilyBudget(100);
        son.spendFamilyBudget(600);
        father.increaseFamilyBudget(55);
        mother.increaseFamilyBudget(45);

        System.out.println("father.allowance = " + father.allowance);//90
        System.out.println("mother.allowance = " + mother.allowance);//40
        System.out.println("son.allowance = " + son.allowance);
        System.out.println("mother.familyBudget = " + Budget.familyBudget);
        System.out.println("father.familyBudget = " + Budget.familyBudget);


    }

}
