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
package controller.laundry;

import implementation.laundry.LaundryPenyerahanServiceImplementation;
import implementation.master.MasterLayananServiceImpl;
import implementation.master.MasterPewangiImplementation;
import java.util.Date;
import java.util.List;
import model.laundry.PenyerahanModel;
import model.master.MasterLayananModel;
import model.master.MasterPewangiModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.laundry.LaundryPenyerahanService;
import service.master.MasterLayananService;
import service.master.MasterPewangiService;
import view.internal.LaundryInternalFrame;

/**
 *
 * @author triastowo
 */
public class LaundryPenyerahanController {

  private final MasterPewangiService pewangiService;
  private final MasterLayananService layananService;
  private final LaundryPenyerahanService penyerahanService;

  public LaundryPenyerahanController() {
    pewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);
    layananService = new MasterLayananServiceImpl(MasterLayananModel.class);
    penyerahanService = new LaundryPenyerahanServiceImplementation(PenyerahanModel.class);
  }

  public void loadPenyerahanData(LaundryInternalFrame view) {
    view.getCbPewangiPenyerahan().removeAllItems();
    view.getCbLayananPenyerahan().removeAllItems();

    List<MasterPewangiModel> listPewangi = pewangiService.findAll();
    for (MasterPewangiModel masterPewangiModel : listPewangi) {
      view.getCbPewangiPenyerahan().addItem(masterPewangiModel.getNamaPewangi());
    }

    List<MasterLayananModel> listLayanan = layananService.findAll();
    for (MasterLayananModel masterLayananModel : listLayanan) {
      view.getCbLayananPenyerahan().addItem(masterLayananModel.getNamaLayanan());
    }
    
    PromptSupport.setPrompt("Nama", view.getTxtNamaPenyerahan());
    PromptSupport.setPrompt("No Nota", view.getTxtNoNotaPenyerahan());
    PromptSupport.setPrompt("Tgl Jadi", view.getTxtTglJadiPenyerahan().getEditor());
    PromptSupport.setPrompt("Tgl Terima", view.getTxtTglTerimaPenyerahan().getEditor());
    PromptSupport.setPrompt("Jumlah", view.getTxtJumlahPenyerahan());

    view.getTxtTglJadiPenyerahan().setDate(new Date());
    view.getTxtTglTerimaPenyerahan().setDate(new Date());
    
  }

  public void saveNewPenyerahan(PenyerahanModel model) {
    penyerahanService.save(model);
  }

}
