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
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.swingx.JXDatePicker;
import org.junit.Test;

/**
 *
 * @author triastowo
 */
public class JXDatePickerTest {
  
  @Test
  public void getValueDatePicker(){
    JXDatePicker datePicker = new JXDatePicker();
    datePicker.setDate(new Date());
    
    System.out.println(datePicker.getFormats());
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    datePicker.setFormats(dateFormat);
    System.out.println(datePicker.getDate());
  }
}
