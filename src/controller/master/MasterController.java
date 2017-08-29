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
package controller.master;

import tablemodel.MasterPewangiTableModel;
import implementation.MasterPelangganImplementation;
import implementation.MasterPewangiImplementation;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import model.MasterPelangganModel;
import model.MasterPewangiModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.MasterPelangganService;
import service.MasterPewangiService;
import tablemodel.MasterPelangganTableModel;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterController {

  private final MasterPelangganService masterPelangganService;
  private final MasterPewangiService masterPewangiService;

  private final MasterPelangganTableModel masterPelangganTableModel;
  private final MasterPewangiTableModel masterPewangiTableModel;

  public MasterController() {
    masterPelangganService = new MasterPelangganImplementation(MasterPelangganModel.class);
    masterPewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);

    masterPelangganTableModel = new MasterPelangganTableModel();
    masterPewangiTableModel = new MasterPewangiTableModel();
  }

  public void tabMasterStateChange(MasterInternalFrame view, ChangeEvent evt) {
    if (evt.getSource() instanceof JTabbedPane) {
      JTabbedPane pane = (JTabbedPane) evt.getSource();
      switch (pane.getSelectedIndex()) {
        case 0:
          this.loadMasterPelangganData(view);
          break;
        case 1:
          this.loadMasterPewangiData(view);
          break;
        case 2:
          System.out.println(2);
          break;
        case 3:
          System.out.println(3);
          break;
      }
    }
  }

  // ====== NON API ==============
  
  /**
   * load master data pelanggan for data lookup
   * @param view 
   */
  private void loadMasterPelangganData(MasterInternalFrame view) {
    List<MasterPelangganModel> findAll = masterPelangganService.findAll();
    masterPelangganTableModel.setList(findAll);
    view.getTabelPelanggan().setModel(masterPelangganTableModel);
    
    // Pengganti Textfield Placeholder
    PromptSupport.setPrompt("No. KTP", view.getTxtNoKtpPelanggan());
    PromptSupport.setPrompt("Nama", view.getTxtNamaPelanggan());
    PromptSupport.setPrompt("No. HP", view.getTxtNoHpPelanggan());
    PromptSupport.setPrompt("Alamat", view.getTxtAlamatPelanggan());
  }

  /**
   * load master data pewangi for lookup
   * @param view 
   */
  private void loadMasterPewangiData(MasterInternalFrame view) {
    List<MasterPewangiModel> findAll = masterPewangiService.findAll();
    masterPewangiTableModel.setList(findAll);
    view.getTabelPewangi().setModel(masterPewangiTableModel);
    
    // Pengganti Textfield Placeholder
    PromptSupport.setPrompt("ID Pewangi", view.getTxtIdPewangi());
    PromptSupport.setPrompt("Nama Pewangi", view.getTxtNamaPewangi());
    PromptSupport.setPrompt("Harga Pewangi", view.getTxtHargaPewangi());
  }

}
