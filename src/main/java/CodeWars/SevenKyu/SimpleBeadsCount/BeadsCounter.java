package CodeWars.SevenKyu.SimpleBeadsCount;

public class BeadsCounter {

    public static int countRedBeads(final int nBlue) {
        if(nBlue < 2) {
            return 0;
        }
        int nRed = 2;

        return (nRed * nBlue) - 2;
    }
}
