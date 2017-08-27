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
public class AsetInternalFrame extends javax.swing.JInternalFrame {

  /**
   * Creates new form AsetInternalFrame
   */
  public AsetInternalFrame() {
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

      panelMenuAset = new javax.swing.JPanel();
      menuAset = new javax.swing.JTabbedPane();
      tabAset = new javax.swing.JPanel();
      txtIdAset = new javax.swing.JTextField();
      txtNamaAset = new javax.swing.JTextField();
      txtMerekAset = new javax.swing.JTextField();
      txtTglTamhabAset = new javax.swing.JTextField();
      txtHargaAset = new javax.swing.JTextField();
      jScrollPane3 = new javax.swing.JScrollPane();
      tabelAset = new javax.swing.JTable();

      menuAset.setBackground(new java.awt.Color(142, 53, 239));
      menuAset.setPreferredSize(new java.awt.Dimension(730, 130));

      tabAset.setBackground(new java.awt.Color(142, 53, 239));
      tabAset.setPreferredSize(new java.awt.Dimension(730, 130));

      txtIdAset.setText("idAset");
      txtIdAset.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtIdAsetActionPerformed(evt);
         }
      });

      txtNamaAset.setText("Nama");
      txtNamaAset.setToolTipText("");
      txtNamaAset.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtNamaAsetActionPerformed(evt);
         }
      });

      txtMerekAset.setText("Merek");
      txtMerekAset.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtMerekAsetActionPerformed(evt);
         }
      });

      txtTglTamhabAset.setText("Tgl. Tambah");
      txtTglTamhabAset.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTglTamhabAsetActionPerformed(evt);
         }
      });

      txtHargaAset.setText("Harga");
      txtHargaAset.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtHargaAsetActionPerformed(evt);
         }
      });

      tabelAset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
      tabelAset.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
         }
      ));
      jScrollPane3.setViewportView(tabelAset);

      javax.swing.GroupLayout tabAsetLayout = new javax.swing.GroupLayout(tabAset);
      tabAset.setLayout(tabAsetLayout);
      tabAsetLayout.setHorizontalGroup(
         tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tabAsetLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(tabAsetLayout.createSequentialGroup()
                  .addGroup(tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtMerekAset, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(tabAsetLayout.createSequentialGroup()
                        .addGroup(tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(txtIdAset, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(txtNamaAset, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addGroup(tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(txtTglTamhabAset, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(txtHargaAset, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addGap(0, 391, Short.MAX_VALUE))
               .addComponent(jScrollPane3))
            .addContainerGap())
      );
      tabAsetLayout.setVerticalGroup(
         tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(tabAsetLayout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtTglTamhabAset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtIdAset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(tabAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtNamaAset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtHargaAset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtMerekAset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
            .addContainerGap())
      );

      menuAset.addTab("Tambah Aset", tabAset);

      javax.swing.GroupLayout panelMenuAsetLayout = new javax.swing.GroupLayout(panelMenuAset);
      panelMenuAset.setLayout(panelMenuAsetLayout);
      panelMenuAsetLayout.setHorizontalGroup(
         panelMenuAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 904, Short.MAX_VALUE)
         .addGroup(panelMenuAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuAset, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
      );
      panelMenuAsetLayout.setVerticalGroup(
         panelMenuAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 570, Short.MAX_VALUE)
         .addGroup(panelMenuAsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuAsetLayout.createSequentialGroup()
               .addComponent(menuAset, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
               .addContainerGap()))
      );

      getContentPane().add(panelMenuAset, java.awt.BorderLayout.CENTER);

      pack();
   }// </editor-fold>//GEN-END:initComponents

  private void txtIdAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAsetActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtIdAsetActionPerformed

  private void txtNamaAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaAsetActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNamaAsetActionPerformed

  private void txtMerekAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerekAsetActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtMerekAsetActionPerformed

  private void txtTglTamhabAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglTamhabAsetActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTglTamhabAsetActionPerformed

  private void txtHargaAsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaAsetActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtHargaAsetActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JTabbedPane menuAset;
   private javax.swing.JPanel panelMenuAset;
   private javax.swing.JPanel tabAset;
   private javax.swing.JTable tabelAset;
   private javax.swing.JTextField txtHargaAset;
   private javax.swing.JTextField txtIdAset;
   private javax.swing.JTextField txtMerekAset;
   private javax.swing.JTextField txtNamaAset;
   private javax.swing.JTextField txtTglTamhabAset;
   // End of variables declaration//GEN-END:variables
}
