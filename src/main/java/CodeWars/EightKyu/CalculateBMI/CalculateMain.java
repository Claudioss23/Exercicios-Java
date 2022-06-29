package CodeWars.EightKyu.CalculateBMI;

import java.util.Scanner;

public class CalculateMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double weight, height;

        System.out.println("Insert weight: ");
        weight = s.nextDouble();

        System.out.println("Insert height: ");
        height = s.nextDouble();

        System.out.println("Result: " + weight / Math.pow(height, 2));
        System.out.println("BMI: " + Calculate.bmi(weight, height));
    }
}
