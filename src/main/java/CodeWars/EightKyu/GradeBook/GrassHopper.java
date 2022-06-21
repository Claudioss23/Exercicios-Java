package CodeWars.EightKyu.GradeBook;

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {

        s1 = (s1 + s2 + s3) / 3;

        if(s1 < 60) {
            return 'F';
        } else if(s1 < 70) {
            return 'D';
        } else if(s1 < 80) {
            return 'C';
        } else if(s1 < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
