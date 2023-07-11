package CodeWars.SevenKyu.FunctionalAddition;

import java.util.function.IntUnaryOperator;

public class Kata {

  public static IntUnaryOperator add(int n) {
    return n2 -> n + n2;
  }
}