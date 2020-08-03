/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author THE
 */
public class DataProvider {

    public int checkDayInMonth(int month, int year) {

        int validYear = this.checkYearValid(year);
        if ((month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) && validYear > 0) {//tháng nằm trong những khoảng này và năm cũng phải tồn tại 
            return 31;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && validYear > 0) {
            return 30;
        } else if ((month == 2) || validYear > 0) {
            if (year % 400 == 0) {
                return 29;
            } else if (year % 100 == 0) {
                return 28;
            } else {
                if (year % 4 == 0) {
                    return 29;
                } else if (year % 4 != 0) {
                    return 28;
                }
            }
        }
        return 0;
    }

    public boolean checkDate(int day, int month, int year) {
        int temp = this.checkDayInMonth(month, year);
            if ((month >= 1 && month <= 12) ) {
            if (day >= 1 ) {
                if (day <= this.checkDayInMonth(month, year)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int checkYearValid(int year) {
        if (year >= 1000 && year <= 3000) {
            return year;
        }
        return 0;
    }

    public int checkMonthValid(int month) {
        if (month >= 1 && month <= 12) {
            return month;
        }
        return 0;
    }

    public int checkDayValid(int day) {
        if (day >= 1 && day <= 31) {
            return day;
        }
        return 0;
    }

    public int showNoticeDayInvalidNumberFormat(String txtDay,
            JFrame dateTimeJFrame) {

        try {
            int day = Integer.parseInt(txtDay);
            if (day >= 1 && day <= 31) {
                return day;
            } else {
                JOptionPane.showMessageDialog(dateTimeJFrame,
                        "Input data for Day is out of range!.");
                return day;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(dateTimeJFrame,
                    "Input data for Day is incorrect format!.");
        }
        return -1;
    }

    public int showNoticeMonthInvalidNumberFormat(String txtMonth,
            JFrame dateTimeJFrame) {

        try {
            int month = Integer.parseInt(txtMonth);
            if (month >= 1 && month <= 12) {
                return month;
            } else {
                JOptionPane.showMessageDialog(dateTimeJFrame,
                        "Input data for Month is out of range!.");
                return month;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(dateTimeJFrame,
                    "Input data for Month is incorrect format!.");
        }
        return -1;
    }

    public int showNoticeYearInvalidNumberFormat(String txtYear,
            JFrame dateTimeJFrame) {

        try {
            int year = Integer.parseInt(txtYear);
            if (year >= 1000 && year <= 3000) {
                return year;
            } else {
                JOptionPane.showMessageDialog(dateTimeJFrame,
                        "Input data for Year is out of range!.");
                return year;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(dateTimeJFrame,
                    "Input data for Year is incorrect format!.");
        }
        return -1;
    }

    public void showNoticeValidDateTime(int day, int month, int year,
            JFrame dateTimeJFrame) {
        JOptionPane.showMessageDialog(dateTimeJFrame,
                day + "/" + month + "/" + year + " is correct date time!.");
    }

    public void showNoticeInValidDateTime(int day, int month, int year,
            JFrame dateTimeJFrame) {
        JOptionPane.showMessageDialog(dateTimeJFrame,
                day + "/" + month + "/" + year + " is NOT correct date time!.");
    }
}
