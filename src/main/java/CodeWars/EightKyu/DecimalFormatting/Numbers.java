package CodeWars.EightKyu.DecimalFormatting;

public class Numbers
{
    public static double TwoDecimalPlaces(double number)
    {
        return (double) Math.round(number * 100) / 100;
    }
}
