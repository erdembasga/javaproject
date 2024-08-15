package practices.practice08;

public class Worker extends Bank{
    public double calculateInterest(double amountToWithDraw) {
        return amountToWithDraw * 15 /100;
    }
}
