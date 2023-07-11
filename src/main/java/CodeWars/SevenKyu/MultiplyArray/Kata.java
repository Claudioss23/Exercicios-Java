package CodeWars.SevenKyu.MultiplyArray;

import java.util.Arrays;
import java.util.function.Function;

public class Kata {
  public static Function<Integer, int[]> multiplyAll(int[] array) {
		return n -> Arrays.stream(array).map(a -> a * n).toArray();
	}
}