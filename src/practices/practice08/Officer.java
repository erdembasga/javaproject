package practices.practice08;

public class Officer extends Bank {
    @Override//This annotation is optional
    public double calculateInterest(double amountToWithDraw) {
        return amountToWithDraw * 10 / 100;
    }
}
