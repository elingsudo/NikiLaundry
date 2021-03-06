/*
 * Copyright (C) 2017 triastowo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package helper;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author triastowo
 */
public class GeneralHelper {

  public static String validasiNullString(String value) {
    if (value == null || "".equals(value)) {
      return "-";
    } else {
      return value;
    }
  }

  public static String validasiNullBigDecimal(String value) {
    if (value == null || "".equals(value)) {
      return "0";
    } else {
      return value;
    }
  }

  public static Integer validasiNullInteger(String value) {
    if (value == null || value.equals("")) {
      return 0;
    } else {
      return Integer.valueOf(value);
    }
  }

  public static Date validasiNullDate(Date value) {
    if (value == null || "".equals(value.getTime()) || value.getTime() == 0) {
      return new Date();
    } else {
      return value;
    }
  }

  /**
   * add days to date
   *
   * @param date
   * @param days
   * @return
   */
  public static Date addDays(Date date, int days) {
    GregorianCalendar cal = new GregorianCalendar();
    cal.setTime(date);
    cal.add(Calendar.DATE, days);
    return cal.getTime();
  }

  /**
   * subtract days to date in java
   *
   * @param date
   * @param days
   * @return
   */
  public static Date subtractDays(Date date, int days) {
    GregorianCalendar cal = new GregorianCalendar();
    cal.setTime(date);
    cal.add(Calendar.DATE, -days);
    return cal.getTime();
  }
}
