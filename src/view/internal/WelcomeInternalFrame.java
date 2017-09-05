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
package view.internal;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author triastowo
 */
public class WelcomeInternalFrame extends javax.swing.JInternalFrame {

  /**
   * Creates new form WelcomeInternalFrame
   */
  public WelcomeInternalFrame() {
    ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      panelWelcome = new javax.swing.JPanel();
      txtNikiLaundryWelcome = new javax.swing.JLabel();
      txtProfesional = new javax.swing.JLabel();
      txtBersih = new javax.swing.JLabel();
      txtRapi = new javax.swing.JLabel();
      txtWangi = new javax.swing.JLabel();

      setBorder(null);

      panelWelcome.setBackground(new java.awt.Color(224, 0, 255));

      txtNikiLaundryWelcome.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
      txtNikiLaundryWelcome.setForeground(new java.awt.Color(54, 33, 89));
      txtNikiLaundryWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      txtNikiLaundryWelcome.setText("Niki Laundry");

      txtProfesional.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      txtProfesional.setForeground(new java.awt.Color(54, 33, 89));
      txtProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checkbox.png"))); // NOI18N
      txtProfesional.setText("Profesional");

      txtBersih.setForeground(new java.awt.Color(54, 33, 89));
      txtBersih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checkbox.png"))); // NOI18N
      txtBersih.setText("Bersih");

      txtRapi.setForeground(new java.awt.Color(54, 33, 89));
      txtRapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checkbox.png"))); // NOI18N
      txtRapi.setText("Rapi");

      txtWangi.setForeground(new java.awt.Color(54, 33, 89));
      txtWangi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checkbox.png"))); // NOI18N
      txtWangi.setText("Wangi");

      javax.swing.GroupLayout panelWelcomeLayout = new javax.swing.GroupLayout(panelWelcome);
      panelWelcome.setLayout(panelWelcomeLayout);
      panelWelcomeLayout.setHorizontalGroup(
         panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelWelcomeLayout.createSequentialGroup()
            .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelWelcomeLayout.createSequentialGroup()
                  .addGap(167, 167, 167)
                  .addComponent(txtProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(18, 18, 18)
                  .addComponent(txtBersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(18, 18, 18)
                  .addComponent(txtRapi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(18, 18, 18)
                  .addComponent(txtWangi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(panelWelcomeLayout.createSequentialGroup()
                  .addGap(195, 195, 195)
                  .addComponent(txtNikiLaundryWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(17, 17, 17)))
            .addGap(190, 190, 190))
      );
      panelWelcomeLayout.setVerticalGroup(
         panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelWelcomeLayout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addComponent(txtNikiLaundryWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE)
            .addGap(19, 19, 19)
            .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(txtProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtBersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtRapi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(txtWangi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(201, 201, 201))
      );

      getContentPane().add(panelWelcome, java.awt.BorderLayout.CENTER);

      pack();
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel panelWelcome;
   private javax.swing.JLabel txtBersih;
   private javax.swing.JLabel txtNikiLaundryWelcome;
   private javax.swing.JLabel txtProfesional;
   private javax.swing.JLabel txtRapi;
   private javax.swing.JLabel txtWangi;
   // End of variables declaration//GEN-END:variables
}
