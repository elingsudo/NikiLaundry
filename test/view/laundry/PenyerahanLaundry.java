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
package view.laundry;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.InitialDB;
import view.internal.LaundryInternalFrame;

/**
 *
 * @author triastowo
 */
public class PenyerahanLaundry extends javax.swing.JFrame {

  /**
   * Creates new form PenyerahanLaundry
   */
  public PenyerahanLaundry() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jDesktopPane1 = new javax.swing.JDesktopPane();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
    jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
      jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 798, Short.MAX_VALUE)
    );
    jDesktopPane1Layout.setVerticalGroup(
      jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 507, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jDesktopPane1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jDesktopPane1)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        InitialDB.init();

        PenyerahanLaundry penyerahanLaundry = new PenyerahanLaundry();
        LaundryInternalFrame laundryInternalFrame = new LaundryInternalFrame();

        laundryInternalFrame.setVisible(true);
        penyerahanLaundry.getjDesktopPane1().add(laundryInternalFrame);
        laundryInternalFrame.setMaximum(true);
        penyerahanLaundry.setVisible(true);
      } catch (PropertyVetoException | ClassNotFoundException | InstantiationException
              | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        Logger.getLogger(PenyerahanLaundry.class.getName()).log(Level.SEVERE, null, ex);
      }
    });
  }

  public JDesktopPane getjDesktopPane1() {
    return jDesktopPane1;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDesktopPane jDesktopPane1;
  // End of variables declaration//GEN-END:variables
}
