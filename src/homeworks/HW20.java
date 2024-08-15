package homeworks;

import java.util.Scanner;

public class HW20 {
/*
    A ball is dropped from a certain height (get the height using Scanner).
    After being dropped, it bounces up to 3/4 of the height it fell from.
    The ball stops bouncing when the bounce height goes below 1 meter.
    Create a do-while code block that calculates the total distance traveled and the number of times it hits the ground.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height from which the ball is dropped");
        double height = scanner.nextDouble();
        double totalDistance = 0;
        int hitCount = 0;

        do {
            hitCount++;
            totalDistance += height;

            height = height * 0.75;

            totalDistance += height;

        } while (height>=1);

        System.out.println("totalDistance = " + totalDistance);
        System.out.println("hitCount = " + hitCount);

    }
}
