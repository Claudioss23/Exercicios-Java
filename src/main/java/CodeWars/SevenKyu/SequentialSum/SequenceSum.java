package CodeWars.SevenKyu.SequentialSum;

public class SequenceSum{

    public static String showSequence(int value){
        if(value < 0) {
            return value + "<" + "0";
        } else if(value == 0) {
            return "0=0";
        }

        String str = "";
        int total = 0;

        for(int i = 0; i <= value; i++) {
            total += i;

            if(i == value) {
                str += i;
            } else {
                str += i + "+";
            }
        }

        return str + " = " + total;
    }
}