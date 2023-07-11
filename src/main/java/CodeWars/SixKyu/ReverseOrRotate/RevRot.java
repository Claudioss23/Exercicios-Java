package CodeWars.SixKyu.ReverseOrRotate;

import static java.util.stream.Stream.*;

public class RevRot {
    
    public static String revRot(String strng, int sz) {
      if (strng.isEmpty() || sz <= 0 || sz > strng.length()) {
        return "";
      }

      String[] arr = of(strng.split("(?<=\\G.{" + sz + "})")).filter(s -> s.length() >= sz).toArray(String[]::new);

      for(int i = 0; i < arr.length; i++) {
        int sum = of(arr[i].split("")).map(Integer::valueOf).reduce(0, (a, n) -> a + n * n * n);

        if(sum % 2 == 0) {
          StringBuilder builder = new StringBuilder();

          arr[i] = builder.append(arr[i]).reverse().toString();
        } else {
          arr[i] = arr[i].substring(1) +
              arr[i].charAt(0);
        }
      }

      return String.join("", arr);
    }
}
