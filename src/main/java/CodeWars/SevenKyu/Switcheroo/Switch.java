package CodeWars.SevenKyu.Switcheroo;

public class Switch {
    public static String switcheroo(String x) {
        String s = "";

        for(char c : x.toCharArray()) {
            if(c == 'a') {
                s += "b";
            } else if(c == 'b') {
                s += "a";
            } else {
                s += "c";
            }
        }

        return s;
    }
}