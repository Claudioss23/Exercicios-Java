package CodeWars.SixKyu.ReverseOrRotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRevRot {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");   
        testing(RevRot.revRot("1234", 0), "");
        testing(RevRot.revRot("", 0), "");
        testing(RevRot.revRot("1234", 5), "");
        String s = "733049910872815764";
        testing(RevRot.revRot(s, 5), "330479108928157");
    }
}