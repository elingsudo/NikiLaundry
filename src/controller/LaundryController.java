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
package controller;

import controller.laundry.LaundryPenyerahanController;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import view.internal.LaundryInternalFrame;

/**
 *
 * @author triastowo
 */
public class LaundryController {
  
  private final LaundryPenyerahanController laundryPenyerahanController;

  public LaundryController() {
    this.laundryPenyerahanController = new LaundryPenyerahanController();
  }
  

  public void tabItemChangeState(LaundryInternalFrame view, ChangeEvent evt) {
    if (evt.getSource() instanceof JTabbedPane) {
      JTabbedPane pane = (JTabbedPane) evt.getSource();
      switch (pane.getSelectedIndex()) {
        case 0:
          laundryPenyerahanController.loadPenyerehanData(view);
          break;
      }
    }
  }
}
