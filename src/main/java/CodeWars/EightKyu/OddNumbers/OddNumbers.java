package CodeWars.EightKyu.OddNumbers;

public class OddNumbers {

    public static int oddCount(int n){
        int oddNumbers = 0;

        for(int i = 0; i < n; i++) {
            if(i % 2 != 0){
                oddNumbers++;
            }
        }
        return oddNumbers;
    }
}
