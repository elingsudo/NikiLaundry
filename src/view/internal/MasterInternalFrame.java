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

import controller.master.MasterController;
import controller.master.MasterLayananController;
import controller.master.MasterPakaianController;
import controller.master.MasterPelangganController;
import controller.master.MasterPewangiController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author triastowo
 */
public class MasterInternalFrame extends javax.swing.JInternalFrame {

  private final MasterController masterController;
  private final MasterLayananController masterLayananController;
  private final MasterPakaianController masterPakaianController;
  private final MasterPewangiController masterPewangiController;
  private final MasterPelangganController masterPelangganController;

  /**
   * Creates new form MasterInternalFrame
   */
  public MasterInternalFrame() {
    masterController = new MasterController();
    masterLayananController = new MasterLayananController();
    masterPakaianController = new MasterPakaianController();
    masterPewangiController = new MasterPewangiController();
    masterPelangganController = new MasterPelangganController();

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

    menuMaster = new javax.swing.JTabbedPane();
    tabPelanggan = new javax.swing.JPanel();
    txtNoKtpPelanggan = new javax.swing.JTextField();
    txtNamaPelanggan = new javax.swing.JTextField();
    cbJenisKelaminPelanggan = new javax.swing.JComboBox<>();
    txtNoHpPelanggan = new javax.swing.JTextField();
    cbJenisPelanggan = new javax.swing.JComboBox<>();
    jScrollPane5 = new javax.swing.JScrollPane();
    txtAlamatPelanggan = new javax.swing.JTextArea();
    btnSavePelanggan = new javax.swing.JButton();
    btnDeletePelanggan = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tabelPelanggan = new javax.swing.JTable();
    tabPewangi = new javax.swing.JPanel();
    txtIdPewangi = new javax.swing.JTextField();
    txtNamaPewangi = new javax.swing.JTextField();
    txtHargaPewangi = new javax.swing.JTextField();
    btnSavePewangi = new javax.swing.JButton();
    btnDeletePewangi = new javax.swing.JButton();
    jScrollPane7 = new javax.swing.JScrollPane();
    tabelPewangi = new javax.swing.JTable();
    tabPakaian = new javax.swing.JPanel();
    txtIdPakaian = new javax.swing.JTextField();
    txtNamaPakaian = new javax.swing.JTextField();
    txtHargaPakaian = new javax.swing.JTextField();
    btnSavePakaian = new javax.swing.JButton();
    btnDeletePakaian = new javax.swing.JButton();
    jScrollPane8 = new javax.swing.JScrollPane();
    tabelPakaian = new javax.swing.JTable();
    tabLayanan = new javax.swing.JPanel();
    txtIdLayanan = new javax.swing.JTextField();
    txtNamaLayanan = new javax.swing.JTextField();
    txtHargaLayanan = new javax.swing.JTextField();
    btnSaveLayanan = new javax.swing.JButton();
    btnSaveDelete = new javax.swing.JButton();
    jScrollPane9 = new javax.swing.JScrollPane();
    tabelLayanan = new javax.swing.JTable();

    setBorder(null);

    menuMaster.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        menuMasterStateChanged(evt);
      }
    });

    tabPelanggan.setBackground(new java.awt.Color(142, 53, 239));

    txtNamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNamaPelangganActionPerformed(evt);
      }
    });

    cbJenisKelaminPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

    txtNoHpPelanggan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNoHpPelangganActionPerformed(evt);
      }
    });

    cbJenisPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEMBER", "NONMEMBER" }));

    txtAlamatPelanggan.setColumns(16);
    txtAlamatPelanggan.setRows(4);
    jScrollPane5.setViewportView(txtAlamatPelanggan);

    btnSavePelanggan.setText("Save");
    btnSavePelanggan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSavePelangganActionPerformed(evt);
      }
    });

    btnDeletePelanggan.setText("Delete");

    tabelPelanggan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane2.setViewportView(tabelPelanggan);

    javax.swing.GroupLayout tabPelangganLayout = new javax.swing.GroupLayout(tabPelanggan);
    tabPelanggan.setLayout(tabPelangganLayout);
    tabPelangganLayout.setHorizontalGroup(
      tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabPelangganLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtNamaPelanggan)
          .addComponent(txtNoKtpPelanggan)
          .addComponent(cbJenisKelaminPelanggan, 0, 209, Short.MAX_VALUE)
          .addComponent(txtNoHpPelanggan))
        .addGap(69, 69, 69)
        .addGroup(tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cbJenisPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(112, 112, 112)
        .addGroup(tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnSavePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnDeletePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(34, Short.MAX_VALUE))
      .addComponent(jScrollPane2)
    );
    tabPelangganLayout.setVerticalGroup(
      tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabPelangganLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtNoKtpPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cbJenisPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(6, 6, 6)
        .addGroup(tabPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(tabPelangganLayout.createSequentialGroup()
            .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbJenisKelaminPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNoHpPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(tabPelangganLayout.createSequentialGroup()
            .addComponent(btnSavePelanggan)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnDeletePelanggan)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
    );

    menuMaster.addTab("Pelanggan", tabPelanggan);

    tabPewangi.setBackground(new java.awt.Color(142, 53, 239));

    txtIdPewangi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtIdPewangiActionPerformed(evt);
      }
    });

    txtNamaPewangi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNamaPewangiActionPerformed(evt);
      }
    });

    btnSavePewangi.setText("Save");
    btnSavePewangi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSavePewangiActionPerformed(evt);
      }
    });

    btnDeletePewangi.setText("Delete");

    tabelPewangi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    tabelPewangi.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane7.setViewportView(tabelPewangi);

    javax.swing.GroupLayout tabPewangiLayout = new javax.swing.GroupLayout(tabPewangi);
    tabPewangi.setLayout(tabPewangiLayout);
    tabPewangiLayout.setHorizontalGroup(
      tabPewangiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPewangiLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabPewangiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtNamaPewangi, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
          .addComponent(txtIdPewangi)
          .addComponent(txtHargaPewangi))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
        .addGroup(tabPewangiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnSavePewangi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnDeletePewangi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
      .addComponent(jScrollPane7)
    );
    tabPewangiLayout.setVerticalGroup(
      tabPewangiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabPewangiLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabPewangiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(tabPewangiLayout.createSequentialGroup()
            .addComponent(txtIdPewangi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNamaPewangi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtHargaPewangi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(tabPewangiLayout.createSequentialGroup()
            .addComponent(btnSavePewangi)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDeletePewangi)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
    );

    menuMaster.addTab("Pewangi", tabPewangi);

    tabPakaian.setBackground(new java.awt.Color(142, 53, 239));

    txtIdPakaian.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtIdPakaianActionPerformed(evt);
      }
    });

    txtNamaPakaian.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNamaPakaianActionPerformed(evt);
      }
    });

    btnSavePakaian.setText("Save");
    btnSavePakaian.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSavePakaianActionPerformed(evt);
      }
    });

    btnDeletePakaian.setText("Delete");

    tabelPakaian.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    tabelPakaian.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane8.setViewportView(tabelPakaian);

    javax.swing.GroupLayout tabPakaianLayout = new javax.swing.GroupLayout(tabPakaian);
    tabPakaian.setLayout(tabPakaianLayout);
    tabPakaianLayout.setHorizontalGroup(
      tabPakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPakaianLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabPakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtIdPakaian)
          .addComponent(txtNamaPakaian, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
          .addComponent(txtHargaPakaian))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
        .addGroup(tabPakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnSavePakaian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnDeletePakaian, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
      .addComponent(jScrollPane8)
    );
    tabPakaianLayout.setVerticalGroup(
      tabPakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabPakaianLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabPakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(tabPakaianLayout.createSequentialGroup()
            .addComponent(btnSavePakaian)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDeletePakaian))
          .addGroup(tabPakaianLayout.createSequentialGroup()
            .addComponent(txtIdPakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNamaPakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtHargaPakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
    );

    menuMaster.addTab("Pakaian", tabPakaian);

    tabLayanan.setBackground(new java.awt.Color(142, 53, 239));

    txtIdLayanan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtIdLayananActionPerformed(evt);
      }
    });

    btnSaveLayanan.setText("Save");
    btnSaveLayanan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveLayananActionPerformed(evt);
      }
    });

    btnSaveDelete.setText("Delete");

    tabelLayanan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    tabelLayanan.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane9.setViewportView(tabelLayanan);

    javax.swing.GroupLayout tabLayananLayout = new javax.swing.GroupLayout(tabLayanan);
    tabLayanan.setLayout(tabLayananLayout);
    tabLayananLayout.setHorizontalGroup(
      tabLayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayananLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabLayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtIdLayanan)
          .addComponent(txtNamaLayanan, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
          .addComponent(txtHargaLayanan))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
        .addGroup(tabLayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnSaveLayanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnSaveDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
      .addComponent(jScrollPane9)
    );
    tabLayananLayout.setVerticalGroup(
      tabLayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabLayananLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(tabLayananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(tabLayananLayout.createSequentialGroup()
            .addComponent(btnSaveLayanan)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnSaveDelete))
          .addGroup(tabLayananLayout.createSequentialGroup()
            .addComponent(txtIdLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNamaLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtHargaLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
    );

    menuMaster.addTab("Layanan", tabLayanan);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(menuMaster, javax.swing.GroupLayout.Alignment.TRAILING)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(menuMaster)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtNamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPelangganActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNamaPelangganActionPerformed

  private void txtNoHpPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoHpPelangganActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNoHpPelangganActionPerformed

  private void txtIdPewangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPewangiActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtIdPewangiActionPerformed

  private void txtNamaPewangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPewangiActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNamaPewangiActionPerformed

  private void txtIdPakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPakaianActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtIdPakaianActionPerformed

  private void txtNamaPakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPakaianActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNamaPakaianActionPerformed

  private void txtIdLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLayananActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtIdLayananActionPerformed

   private void menuMasterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menuMasterStateChanged
     masterController.tabMasterStateChange(this, evt);
   }//GEN-LAST:event_menuMasterStateChanged

   private void btnSaveLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLayananActionPerformed
     masterLayananController.save(this);
   }//GEN-LAST:event_btnSaveLayananActionPerformed

   private void btnSavePakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePakaianActionPerformed
      masterPakaianController.save(this);
   }//GEN-LAST:event_btnSavePakaianActionPerformed

  private void btnSavePewangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePewangiActionPerformed
    masterPewangiController.save(this);
  }//GEN-LAST:event_btnSavePewangiActionPerformed

  private void btnSavePelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePelangganActionPerformed
    masterPelangganController.save(this);
  }//GEN-LAST:event_btnSavePelangganActionPerformed

  public JTable getTabelPelanggan() {
    return tabelPelanggan;
  }

  public JTable getTabelPewangi() {
    return tabelPewangi;
  }

  public JTextArea getTxtAlamatPelanggan() {
    return txtAlamatPelanggan;
  }

  public JTextField getTxtNamaPelanggan() {
    return txtNamaPelanggan;
  }

  public JTextField getTxtNoKtpPelanggan() {
    return txtNoKtpPelanggan;
  }

  public JTextField getTxtNoHpPelanggan() {
    return txtNoHpPelanggan;
  }

  public JComboBox<String> getCbJenisKelaminPelanggan() {
    return cbJenisKelaminPelanggan;
  }

  public JComboBox<String> getCbJenisPelanggan() {
    return cbJenisPelanggan;
  }

  public JTextField getTxtHargaPewangi() {
    return txtHargaPewangi;
  }

  public JTextField getTxtIdPewangi() {
    return txtIdPewangi;
  }

  public JTextField getTxtNamaPewangi() {
    return txtNamaPewangi;
  }

  public JTextField getTxtHargaPakaian() {
    return txtHargaPakaian;
  }

  public JTextField getTxtIdPakaian() {
    return txtIdPakaian;
  }

  public JTextField getTxtNamaPakaian() {
    return txtNamaPakaian;
  }

  public JTable getTabelPakaian() {
    return tabelPakaian;
  }

  public JTable getTabelLayanan() {
    return tabelLayanan;
  }

  public JTextField getTxtHargaLayanan() {
    return txtHargaLayanan;
  }

  public JTextField getTxtIdLayanan() {
    return txtIdLayanan;
  }

  public JTextField getTxtNamaLayanan() {
    return txtNamaLayanan;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDeletePakaian;
  private javax.swing.JButton btnDeletePelanggan;
  private javax.swing.JButton btnDeletePewangi;
  private javax.swing.JButton btnSaveDelete;
  private javax.swing.JButton btnSaveLayanan;
  private javax.swing.JButton btnSavePakaian;
  private javax.swing.JButton btnSavePelanggan;
  private javax.swing.JButton btnSavePewangi;
  private javax.swing.JComboBox<String> cbJenisKelaminPelanggan;
  private javax.swing.JComboBox<String> cbJenisPelanggan;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JScrollPane jScrollPane7;
  private javax.swing.JScrollPane jScrollPane8;
  private javax.swing.JScrollPane jScrollPane9;
  private javax.swing.JTabbedPane menuMaster;
  private javax.swing.JPanel tabLayanan;
  private javax.swing.JPanel tabPakaian;
  private javax.swing.JPanel tabPelanggan;
  private javax.swing.JPanel tabPewangi;
  private javax.swing.JTable tabelLayanan;
  private javax.swing.JTable tabelPakaian;
  private javax.swing.JTable tabelPelanggan;
  private javax.swing.JTable tabelPewangi;
  private javax.swing.JTextArea txtAlamatPelanggan;
  private javax.swing.JTextField txtHargaLayanan;
  private javax.swing.JTextField txtHargaPakaian;
  private javax.swing.JTextField txtHargaPewangi;
  private javax.swing.JTextField txtIdLayanan;
  private javax.swing.JTextField txtIdPakaian;
  private javax.swing.JTextField txtIdPewangi;
  private javax.swing.JTextField txtNamaLayanan;
  private javax.swing.JTextField txtNamaPakaian;
  private javax.swing.JTextField txtNamaPelanggan;
  private javax.swing.JTextField txtNamaPewangi;
  private javax.swing.JTextField txtNoHpPelanggan;
  private javax.swing.JTextField txtNoKtpPelanggan;
  // End of variables declaration//GEN-END:variables
}
