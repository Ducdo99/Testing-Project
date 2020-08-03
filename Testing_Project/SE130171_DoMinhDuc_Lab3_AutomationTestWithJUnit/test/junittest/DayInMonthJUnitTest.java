/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import model.DataProvider;
import java.lang.NumberFormatException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author THE
 */
public class DayInMonthJUnitTest {

    private final DataProvider dataProvider = new DataProvider();

    @Test
    public void UTCID01() {
        assertEquals(31, dataProvider.checkDayInMonth(1, 2020));
    }

    @Test
    public void UTCID02() {
        assertEquals(31, dataProvider.checkDayInMonth(3, 2020));
    }

    @Test
    public void UTCID03() {
        assertEquals(31, dataProvider.checkDayInMonth(5, 2020));
    }

    @Test
    public void UTCID04() {
        assertEquals(31, dataProvider.checkDayInMonth(7, 2020));
    }

    @Test
    public void UTCID05() {
        assertEquals(31, dataProvider.checkDayInMonth(8, 2020));
    }

    @Test
    public void UTCID06() {
        assertEquals(31, dataProvider.checkDayInMonth(10, 2020));
    }

    @Test
    public void UTCID07() {
        assertEquals(31, dataProvider.checkDayInMonth(12, 2020));
    }

    @Test
    public void UTCID08() {
        assertEquals(30, dataProvider.checkDayInMonth(4, 2020));
    }

    @Test
    public void UTCID09() {
        assertEquals(30, dataProvider.checkDayInMonth(6, 2020));
    }

    @Test
    public void UTCID10() {
        assertEquals(30, dataProvider.checkDayInMonth(9, 2020));
    }

    @Test
    public void UTCID11() {
        assertEquals(30, dataProvider.checkDayInMonth(11, 2020));
    }

    @Test
    public void UTCID12() {
        assertEquals(28, dataProvider.checkDayInMonth(2, 2019));
    }

    @Test
    public void UTCID13() {
        assertEquals(29, dataProvider.checkDayInMonth(2, 2020));
    }

    @Test(expected = NumberFormatException.class)
    public void UTCID14() {
        int a = Integer.parseInt("hello");
        int b = Integer.parseInt("");
        dataProvider.checkDayInMonth(a, b);
//        assertEquals(NumberFormatException, dataProvider.checkDayInMonth(a, b));
    }

    @Test
    public void UTCID15() {
        assertEquals(0, dataProvider.checkDayInMonth(13, 2019));
    }

    @Test
    public void UTCID16() {
        assertEquals(0, dataProvider.checkDayInMonth(-1, 2019));
    }

    @Test(expected = NumberFormatException.class)
    public void UTCID17() {
        int month = Integer.parseInt("");
        int year = Integer.parseInt("hello");
        dataProvider.checkDayInMonth(month, year);
    }
    
    public void UTCID18() {
        assertEquals(0, dataProvider.checkDayInMonth(12, -1999));
    }
    
    public void UTCID19() {
        assertEquals(0, dataProvider.checkDayInMonth(11, -1999));
    }
    public void UTCID20() {
        assertEquals(0, dataProvider.checkDayInMonth(2, -1999));
    }

}
