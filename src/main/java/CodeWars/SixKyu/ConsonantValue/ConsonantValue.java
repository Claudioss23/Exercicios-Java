package CodeWars.SixKyu.ConsonantValue;

public class ConsonantValue {
    public static int solve(final String s) {
        int total = 0;
        String[] arr = s
                .replaceAll("[aeiou]", " ")
                .split("\\s+");

        for(String str : arr) {
            int values = 0;
            for (char c : str.toCharArray()) {
                values += ((int) c) - 96;
            }
            if (values > total) {
                total = values;
            }
        }

        return total;
    }
}