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
package controller;

import javax.swing.JOptionPane;
import view.NikiLaundryView;

/**
 *
 * @author Me
 */
public class NikiLaundryController {

  public void umpetnaPanelPasPertamaJalan(NikiLaundryView view) {
    NikiLaundryView.panelMenu.setVisible(false);
    NikiLaundryView.panelMenuAset.setVisible(false);
    NikiLaundryView.panelMenuLaporan.setVisible(false);
    NikiLaundryView.panelMenuLaundry.setVisible(false);
    NikiLaundryView.panelMenuMaster.setVisible(false);
  }

  public void tutupAplikasi(NikiLaundryView view) {
    String pesan = "Are You Sure to Exit?";
    String title = "Exit Application";
    if (JOptionPane.showConfirmDialog(view, pesan, title, JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }

}
