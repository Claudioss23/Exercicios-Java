package CodeWars.SixKyu.DashatizeIt;

public class Solution {

    public static String dashatize(int num) {
      return String.valueOf(num)
					.replaceAll("([13579])", "-$1-")
          .replaceAll("--", "-")
					.replaceAll("^-+|-+$|--", "");
    }
}