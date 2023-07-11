package CodeWars.SixKyu.EncryptThis;

public class Kata {
    public static String encryptThis(String text) {
        if(text.length() == 0) {
            return "";
        }

        String[] arr = text.split("\\s+");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() >= 2) {
                char[] ch = arr[i].toCharArray();
                char temp = ch[1];

                ch[1] = ch[ch.length - 1];
                ch[ch.length - 1] = temp;

                arr[i] = new String(ch);

                arr[i] = (int) arr[i].charAt(0) + arr[i].substring(1);
            } else {
                arr[i] = String.valueOf((int) arr[i].charAt(0));
            }
        }

        return String.join(" ", arr);
    }
}
