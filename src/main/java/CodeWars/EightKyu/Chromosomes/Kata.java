package CodeWars.EightKyu.Chromosomes;

public class Kata {
  public static String chromosomeCheck(String sperm) {
    return sperm.contains("Y") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
  }
}