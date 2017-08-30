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

import implementation.master.MasterLayananServiceImpl;
import java.math.BigDecimal;
import java.util.List;
import model.master.MasterLayananModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.master.MasterLayananService;
import tablemodel.master.MasterLayananTableModel;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterLayananController {
  
  private final MasterLayananService masterLayananService;
  private final MasterLayananTableModel masterLayananTableModel;

  public MasterLayananController() {
    masterLayananService = new MasterLayananServiceImpl(MasterLayananModel.class);
    masterLayananTableModel = new MasterLayananTableModel();
  }

  public void loadMasterLayananData(MasterInternalFrame view) {
    List<MasterLayananModel> findAll = masterLayananService.findAll();
    masterLayananTableModel.setList(findAll);
    view.getTabelLayanan().setModel(masterLayananTableModel);
    
    // Pengganti Textfield Placeholder
    PromptSupport.setPrompt("ID Pewangi", view.getTxtIdLayanan());
    PromptSupport.setPrompt("Nama Pewangi", view.getTxtNamaLayanan());
    PromptSupport.setPrompt("Harga Pewangi", view.getTxtHargaLayanan());
  }

  public void save(MasterInternalFrame view) {
    String id = view.getTxtIdLayanan().getText();
    String nama = view.getTxtNamaLayanan().getText();
    String harga = view.getTxtHargaLayanan().getText();
    
    MasterLayananModel model = new MasterLayananModel();
    model.setIdLayanan(id);
    model.setNamaLayanan(nama);
    model.setHarga(new BigDecimal(harga));
    masterLayananService.save(model);
    
    loadMasterLayananData(view);
  }

}
