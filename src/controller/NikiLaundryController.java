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

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.NikiLaundryView;
import static view.NikiLaundryView.baseContainer;
import view.internal.WelcomeInternalFrame;

/**
 *
 * @author Me
 */
public class NikiLaundryController {

  public void umpetnaPanelPasPertamaJalan(NikiLaundryView view) {
    try {
      NikiLaundryView.panelMenu.setVisible(false);
      baseContainer.removeAll();
      WelcomeInternalFrame internalFrame = new WelcomeInternalFrame();
      internalFrame.setVisible(true);
      baseContainer.add(internalFrame);
      internalFrame.setMaximum(true);
      NikiLaundryView.txtUserName.requestFocus();
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void tutupAplikasi(NikiLaundryView view) {
    String pesan = "Are You Sure to Exit?";
    String title = "Exit Application";
    if (JOptionPane.showConfirmDialog(view, pesan, title, JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }
  
  public void loginButtonActionPerform() {
    NikiLaundryView.panelLogin.setVisible(false);
    NikiLaundryView.panelMenu.setVisible(true);
  }

}
