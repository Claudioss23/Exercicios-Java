package CodeWars.EightKyu.AreaOfASquare;

public class Geometry{
    public static double squareArea(double A){
        return Math.round((((A * 2) / Math.PI) * ((A * 2) / Math.PI)) * 100) / 100.0;
    }
}