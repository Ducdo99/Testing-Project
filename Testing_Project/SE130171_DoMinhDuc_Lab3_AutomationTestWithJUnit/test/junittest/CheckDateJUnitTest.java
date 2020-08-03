/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import model.DataProvider;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author THE
 */
public class CheckDateJUnitTest {

    private final DataProvider dataProvider = new DataProvider();

    @Test
    public void UTCID01() {
        int day = 28;
        int month = 2;
        int year = 2019;
        assertEquals(true, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID02() {
        int day = 28;
        int month = 2;
        int year = 2020;
        assertEquals(true, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID03() {
        int day = 29;
        int month = 2;
        int year = 2019;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID04() {
        int day = 29;
        int month = 2;
        int year = 2020;
        assertEquals(true, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID05() {
        int day = 31;
        int month = 3;
        int year = 2019;
        assertEquals(true, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID06() {
        int day = 32;
        int month = 4;
        int year = 2020;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test(expected = NumberFormatException.class)
    public void UTCID07() {
        int day = Integer.parseInt("hello");
        int month = Integer.parseInt("");
        int year = -199;
        dataProvider.checkDate(day, month, year);
    }

    @Test(expected = NumberFormatException.class)
    public void UTCID08() {
        int day = Integer.parseInt("");
        int month = Integer.parseInt("hello");
        int year = Integer.parseInt("");
        assertEquals(true, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID09() {
        int day = -1;
        int month = -1;
        int year = -199;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID10() {
        int day = 32;
        int month = 3;
        int year = 2019;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID11() {
        int day = 32;
        int month = 2;
        int year = 2019;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID12() {
        int day = 31;
        int month = -1;
        int year = 2019;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID13() {
        int day = 31;
        int month = 13;
        int year = 2019;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test
    public void UTCID14() {
        int day = 31;
        int month = 3;
        int year = -199;
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }

    @Test(expected = NumberFormatException.class)
    public void UTCID15() {
        int day = 31;
        int month = 3;
        int year = Integer.parseInt("");
        assertEquals(false, dataProvider.checkDate(day, month, year));
    }
    

}
