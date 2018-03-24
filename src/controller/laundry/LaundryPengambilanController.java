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

import implementation.master.MasterLayananServiceImpl;
import implementation.master.MasterPewangiImplementation;
import java.util.List;
import model.master.MasterLayananModel;
import model.master.MasterPewangiModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.master.MasterLayananService;
import service.master.MasterPewangiService;
import view.internal.LaundryInternalFrame;

/**
 *
 * @author triastowo
 */
public class LaundryPengambilanController {

  private final MasterLayananService layananService;
  private final MasterPewangiService pewangiService;

  public LaundryPengambilanController() {
    layananService = new MasterLayananServiceImpl(MasterLayananModel.class);
    pewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);
  }

  public void loadPengambilanData(LaundryInternalFrame view) {
    view.getCbPewangiPengambilan().removeAllItems();
    view.getCdLayananPengambilan().removeAllItems();

    List<MasterLayananModel> layananList = layananService.findAll();
    for (MasterLayananModel model : layananList) {
      view.getCdLayananPengambilan().addItem(model.getNamaLayanan());
    }

    List<MasterPewangiModel> pewangiList = pewangiService.findAll();
    for (MasterPewangiModel model : pewangiList) {
      view.getCbPewangiPengambilan().addItem(model.getNamaPewangi());
    }

    PromptSupport.setPrompt("Nama", view.getTxtNamaPengambilan());
    PromptSupport.setPrompt("No Nota", view.getTxtNoNotaPengambilan());
    PromptSupport.setPrompt("Jumlah (Kg)", view.getTxtJumlahPengambilan());
    PromptSupport.setPrompt("Tgl Jadi", view.getTxtTglJadiPengambilan().getEditor());
    PromptSupport.setPrompt("Tgl Ambil", view.getTxtTglAmbilPengambilan().getEditor());
    PromptSupport.setPrompt("Banyaknya Cuci", view.getTxtBanyaknyaCuciPengambilan());
    PromptSupport.setPrompt("Jumlah Bayar", view.getTxtJumlahBayarPengambilan());
    PromptSupport.setPrompt("Bayar", view.getTxtBayarPengambilan());
    PromptSupport.setPrompt("Diskon", view.getTxtDiskonPengambilan());
    PromptSupport.setPrompt("Pengembalian", view.getTxtKembaliPengambilan());

  }

}
