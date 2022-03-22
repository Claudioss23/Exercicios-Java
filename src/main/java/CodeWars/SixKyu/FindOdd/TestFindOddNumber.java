package CodeWars.SixKyu.FindOdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFindOddNumber {

    @Test
    public void findTest() {
        Assertions.assertEquals(5, FindOddNumber.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        Assertions.assertEquals(-1, FindOddNumber.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        Assertions.assertEquals(5, FindOddNumber.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        Assertions.assertEquals(10, FindOddNumber.findIt(new int[]{10}));
        Assertions.assertEquals(10, FindOddNumber.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        Assertions.assertEquals(1, FindOddNumber.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
