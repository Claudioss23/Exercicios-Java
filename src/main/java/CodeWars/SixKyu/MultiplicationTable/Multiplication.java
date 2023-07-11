package CodeWars.SixKyu.MultiplicationTable;

public class Multiplication{
    public static int [][] multiplicationTable(int n){
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = (j + 1) * (i + 1);
            }
        }

        return arr;
    }
}