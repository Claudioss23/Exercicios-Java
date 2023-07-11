package CodeWars.SevenKyu.SortGiftCode;

import java.util.Arrays;

public class GiftSorter{
    public String sortGiftCode(String code){
        char[] c = code.toCharArray();

        Arrays.sort(c);

        return new String(c);
    }
}