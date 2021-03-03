import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YahtzeeTest {
    Yahtzee yahtzee = new Yahtzee();

    @Test
    public void yahtzeeTest1() {
        int expected = 10;
        int actual = yahtzee.yahtzee_upper(new int[]{2, 3, 5, 5, 6});
        assertEquals(expected, actual);
    }

    @Test
    public void yahtzeeTest2() {
        int expected = 4;
        int actual = yahtzee.yahtzee_upper(new int[]{1, 1, 1, 1, 3});
        assertEquals(expected, actual);
    }

    @Test
    public void yahtzeeTest3() {
        int expected = 6;
        int actual = yahtzee.yahtzee_upper(new int[]{1, 1, 1, 3, 3});
        assertEquals(expected, actual);
    }

    @Test
    public void yahtzeeTest4() {
        int expected = 5;
        int actual = yahtzee.yahtzee_upper(new int[]{1, 2, 3, 4, 5});
        assertEquals(expected, actual);
    }


    @Test
    public void yahtzeeTest5() {
        int expected = 30;
        int actual = yahtzee.yahtzee_upper(new int[]{6, 6, 6, 6, 6});
        assertEquals(expected, actual);
    }

    @Test
    public void yahtzeeOptionalBonusTest() {
        int expected = 123456;
        int actual = yahtzee.yahtzee_upper(new int[]{1654, 1654, 50995, 30864, 1654, 50995, 22747,
                1654, 1654, 1654, 1654, 1654, 30864, 4868, 1654, 4868, 1654,
                30864, 4868, 30864});
        assertEquals(expected, actual);
    }
}
