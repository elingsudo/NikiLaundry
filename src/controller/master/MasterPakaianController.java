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

import helper.GeneralHelper;
import implementation.master.MasterPakaianImplementation;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JTextField;
import model.master.MasterPakaianModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.master.MasterPakaianService;
import tablemodel.master.MasterPakaianTableModel;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterPakaianController {
  
  private final MasterPakaianService masterPakaianService;
  private final MasterPakaianTableModel masterPakaianTableModel;

  public MasterPakaianController() {
    masterPakaianService = new MasterPakaianImplementation(MasterPakaianModel.class);
    masterPakaianTableModel = new MasterPakaianTableModel();
  }
  
  public void loadMasterPakaianData(MasterInternalFrame view) {
    List<MasterPakaianModel> findAll = masterPakaianService.findAll();
    masterPakaianTableModel.setList(findAll);
    view.getTabelPakaian().setModel(masterPakaianTableModel);

    // Pengganti Textfield Placeholder
    PromptSupport.setPrompt("ID Pewangi", view.getTxtIdPakaian());
    PromptSupport.setPrompt("Nama Pewangi", view.getTxtNamaPakaian());
    PromptSupport.setPrompt("Harga Pewangi", view.getTxtHargaPakaian());
  }

  public void save(MasterInternalFrame view) {
    String idPakaian = GeneralHelper.validasiNullString(view.getTxtIdPakaian().getText());
    String namaPakaian = GeneralHelper.validasiNullString(view.getTxtNamaPakaian().getText());
    String hargaPakaian = GeneralHelper.validasiNullBigDecimal(view.getTxtHargaPakaian().getText());
    
    MasterPakaianModel model = new MasterPakaianModel();
    model.setIdPakaian(idPakaian);
    model.setNamaPakaian(namaPakaian);
    model.setHarga(new BigDecimal(hargaPakaian));
    masterPakaianService.save(model);
    
    loadMasterPakaianData(view);
  }
  
}
