package CodeWars.EightKyu.CalculateBMI;

public class Calculate {

    public static String bmi(double weight, double height) {
        if(weight / Math.pow(height, 2) <= 18.5) {
            return "Underweight";
        } else if(weight / Math.pow(height, 2) <= 25) {
            return "Normal";
        } else if(weight / Math.pow(height, 2) <= 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
