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

import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.NikiLaundryView;
import static view.NikiLaundryView.baseContainer;
import static view.NikiLaundryView.btnAset;
import static view.NikiLaundryView.btnLaporan;
import static view.NikiLaundryView.btnLaundry;
import static view.NikiLaundryView.btnMaster;
import view.internal.AsetInternalFrame;
import view.internal.LaporanInternalFrame;
import view.internal.LaundryInternalFrame;
import view.internal.MasterInternalFrame;
import controller.master.WelcomeInternalFrame;

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

  public void menuLaundryPressed(NikiLaundryView view) {
    try {
      setColor(NikiLaundryView.btnLaundry);
      resetColor(NikiLaundryView.btnMaster);
      resetColor(NikiLaundryView.btnAset);
      resetColor(NikiLaundryView.btnLaporan);

      baseContainer.removeAll();
      LaundryInternalFrame internalFrame = new LaundryInternalFrame();
      internalFrame.setVisible(true);
      baseContainer.add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void menuMasterPressed(NikiLaundryView view) {
    try {
      resetColor(NikiLaundryView.btnLaundry);
      setColor(NikiLaundryView.btnMaster);
      resetColor(NikiLaundryView.btnAset);
      resetColor(NikiLaundryView.btnLaporan);

      baseContainer.removeAll();
      MasterInternalFrame internalFrame = new MasterInternalFrame();
      internalFrame.setVisible(true);
      baseContainer.add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void menuAsetPressed(NikiLaundryView view) {
    try {
      resetColor(NikiLaundryView.btnLaundry);
      resetColor(NikiLaundryView.btnMaster);
      setColor(NikiLaundryView.btnAset);
      resetColor(NikiLaundryView.btnLaporan);

      baseContainer.removeAll();
      AsetInternalFrame internalFrame = new AsetInternalFrame();
      internalFrame.setVisible(true);
      baseContainer.add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void menuLaporanPressed(NikiLaundryView view) {
    try {
      resetColor(btnLaundry);
      resetColor(btnMaster);
      resetColor(btnAset);
      setColor(btnLaporan);

      baseContainer.removeAll();
      LaporanInternalFrame internalFrame = new LaporanInternalFrame();
      internalFrame.setVisible(true);
      baseContainer.add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /* ================= NON API ====================== */
  private void setColor(JPanel panel) {
    panel.setBackground(new Color(85, 65, 118));
  }

  private void resetColor(JPanel panel) {
    panel.setBackground(new Color(54, 33, 89));
  }

}
