package CodeWars.EightKyu.Banjo;

public class Banjo {

    public static String areYouPlayingBanjo(String name) {
        String c = String.valueOf(name.charAt(0));

        if(c.contains("R") || c.contains("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
