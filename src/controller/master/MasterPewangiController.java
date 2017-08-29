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

import implementation.master.MasterPewangiImplementation;
import java.util.List;
import model.master.MasterPewangiModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.master.MasterPewangiService;
import tablemodel.master.MasterPewangiTableModel;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterPewangiController {
  
  private final MasterPewangiService masterPewangiService;
  private final MasterPewangiTableModel masterPewangiTableModel;

  public MasterPewangiController() {
    masterPewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);
    masterPewangiTableModel = new MasterPewangiTableModel();
  }
  
  
  
  /**
   * load master data pewangi for lookup
   *
   * @param view
   */
  public void loadMasterPewangiData(MasterInternalFrame view) {
    List<MasterPewangiModel> findAll = masterPewangiService.findAll();
    masterPewangiTableModel.setList(findAll);
    view.getTabelPewangi().setModel(masterPewangiTableModel);

    // Pengganti Textfield Placeholder
    PromptSupport.setPrompt("ID Pewangi", view.getTxtIdPewangi());
    PromptSupport.setPrompt("Nama Pewangi", view.getTxtNamaPewangi());
    PromptSupport.setPrompt("Harga Pewangi", view.getTxtHargaPewangi());
  }
}
