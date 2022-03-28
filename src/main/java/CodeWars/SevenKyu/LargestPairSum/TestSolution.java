package CodeWars.SevenKyu.LargestPairSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSolution {

    @Test
    public void basicTestCases(){
        assertEquals(42, Solution.largestPairSum(new int[]{10,14,2,23,19}));
        assertEquals(0, Solution.largestPairSum(new int[]{-100,-29,-24,-19,19}));
        assertEquals(10, Solution.largestPairSum(new int[]{1,2,3,4,6,-1,2}));
        assertEquals(-18, Solution.largestPairSum(new int[]{-10,-8,-16,-18,-19}));
    }
}
