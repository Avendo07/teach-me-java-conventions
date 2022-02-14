import powerpackage.PowerFinder;
import org.junit.Test;

public class PowerTest {
    @Test
    public void One_Raised_To_One_Is_One() {
        assert PowerFinder.findPower(1, 1) == 1;
    }

    @Test
    public void Two_Raised_To_one_Is_Two() {
        assert PowerFinder.findPower(2, 1) == 2;
    }

    @Test
    public void Two_Raised_To_two_Is_Four() {
        assert PowerFinder.findPower(2, 2) == 4;
    }

    @Test
    public void Three_Raised_To_three_Is_Nine() {
        int expected = 3*3;                         //Added to use breakpoints in debugger
        int actual = PowerFinder.findPower(3, 2);
        assert  expected == actual;
    }
}
