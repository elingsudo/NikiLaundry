/*
 * Copyright (C) 2017 Me
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
package utility;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

/**
 *
 * @author Me
 *
 * use DateTimeFormatter, instead of SimpleDateFormat becouse it's thread-safe DateTime format
 * "yyyy-MM-dd HH:mm"
 */
public class DateTimeTest {

  /**
   * convert from datetime string into datetime object this is ISO datetime format
   * "2017-03-08T12:30:54"
   */
  @Test
  public void parseStringToLocalDateTimeTest() {
    String date = "2017-03-08T12:30:54";
    LocalDateTime localdatetime = LocalDateTime.parse(date);
    System.out.println("origional date as string: " + date);
    System.out.println("generated LocalDateTime: " + localdatetime);
  }

  /**
   * convert from datetime String into datetime object using custom format the result will become
   * ISO format "2017-03-08T12:30:54"
   */
  @Test
  public void parseStringToLocalDateTimeWithFormatTest() {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    String date = "2017-03-08 13:54";
    LocalDateTime localdatetime = LocalDateTime.parse(date, format);
    System.out.println("origional date as string using format: " + date);
    System.out.println("generated LocalDateTime using format: " + localdatetime);
  }

  /**
   * this test will convert DateTime object with custom format into String using this format
   * "dd-MM-yyyy HH:mm"
   */
  @Test
  public void formatDateTimeObjectIntoStringTest() {
    DateTimeFormatter aFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    LocalDateTime localDateTime = LocalDateTime.of(2017, Month.AUGUST, 3, 12, 30);
    String foramttedString = localDateTime.format(aFormatter); // "2017-03-08 12:30" 
    System.out.println("origional LocalDatetime object: " + localDateTime);
    System.out.println("generated string : " + foramttedString);
  }
}
