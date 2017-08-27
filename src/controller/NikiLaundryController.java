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
import view.internal.AsetInternalFrame;
import view.internal.LaporanInternalFrame;
import view.internal.LaundryInternalFrame;
import view.internal.MasterInternalFrame;
import view.internal.WelcomeInternalFrame;

/**
 *
 * @author Me
 */
public class NikiLaundryController {

  public void umpetnaPanelPasPertamaJalan(NikiLaundryView view) {
    try {
      view.getPanelMenu().setVisible(false);
      view.getBaseContainer().removeAll();
      WelcomeInternalFrame internalFrame = new WelcomeInternalFrame();
      internalFrame.setVisible(true);
      view.getBaseContainer().add(internalFrame);
      internalFrame.setMaximum(true);
      view.getTxtUserName().requestFocus();
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

  public void loginButtonActionPerform(NikiLaundryView view) {
    view.getPanelLogin().setVisible(false);
    view.getPanelMenu().setVisible(true);
  }

  public void menuLaundryPressed(NikiLaundryView view) {
    try {
      setColor(view.getBtnLaundry());
      resetColor(view.getBtnMaster());
      resetColor(view.getBtnAset());
      resetColor(view.getBtnLaporan());

      view.getBaseContainer().removeAll();
      LaundryInternalFrame internalFrame = new LaundryInternalFrame();
      internalFrame.setVisible(true);
      view.getBaseContainer().add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void menuMasterPressed(NikiLaundryView view) {
    try {
      resetColor(view.getBtnLaundry());
      setColor(view.getBtnMaster());
      resetColor(view.getBtnAset());
      resetColor(view.getBtnLaporan());

      view.getBaseContainer().removeAll();
      MasterInternalFrame internalFrame = new MasterInternalFrame();
      internalFrame.setVisible(true);
      view.getBaseContainer().add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void menuAsetPressed(NikiLaundryView view) {
    try {
      resetColor(view.getBtnLaundry());
      resetColor(view.getBtnMaster());
      setColor(view.getBtnAset());
      resetColor(view.getBtnLaporan());

      view.getBaseContainer().removeAll();
      AsetInternalFrame internalFrame = new AsetInternalFrame();
      internalFrame.setVisible(true);
      view.getBaseContainer().add(internalFrame);
      internalFrame.setMaximum(true);
    } catch (PropertyVetoException ex) {
      Logger.getLogger(NikiLaundryView.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void menuLaporanPressed(NikiLaundryView view) {
    try {
      resetColor(view.getBtnLaundry());
      resetColor(view.getBtnMaster());
      resetColor(view.getBtnAset());
      setColor(view.getBtnLaporan());

      view.getBaseContainer().removeAll();
      LaporanInternalFrame internalFrame = new LaporanInternalFrame();
      internalFrame.setVisible(true);
      view.getBaseContainer().add(internalFrame);
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
