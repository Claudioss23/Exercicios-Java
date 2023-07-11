package CodeWars.SixKyu.CountingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
	  Map<String, Integer> map = new HashMap<>();
	  for(String s : text.toLowerCase().split("")) {
		  if (map.containsKey(s)) {
			  map.put(s, map.get(s) + 1);
		  } else {
			  map.put(s, 1);
		  }
	  }

	  return (int) map.values().stream().filter(a -> a > 1).count();
  }
}