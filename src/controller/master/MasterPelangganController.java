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
import implementation.master.MasterPelangganImplementation;
import java.util.List;
import model.master.MasterPelangganModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import service.master.MasterPelangganService;
import tablemodel.master.MasterPelangganTableModel;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterPelangganController {

  private final MasterPelangganService masterPelangganService;
  private final MasterPelangganTableModel masterPelangganTableModel;

  public MasterPelangganController() {
    masterPelangganService = new MasterPelangganImplementation(MasterPelangganModel.class);
    masterPelangganTableModel = new MasterPelangganTableModel();
  }

  /**
   * load master data pelanggan for data lookup
   *
   * @param view
   */
  public void loadMasterPelangganData(MasterInternalFrame view) {
    List<MasterPelangganModel> findAll = masterPelangganService.findAll();
    masterPelangganTableModel.setList(findAll);
    view.getTabelPelanggan().setModel(masterPelangganTableModel);

    // Pengganti Textfield Placeholder
    PromptSupport.setPrompt("No. KTP", view.getTxtNoKtpPelanggan());
    PromptSupport.setPrompt("Nama", view.getTxtNamaPelanggan());
    PromptSupport.setPrompt("No. HP", view.getTxtNoHpPelanggan());
    PromptSupport.setPrompt("Alamat", view.getTxtAlamatPelanggan());
  }

  public void save(MasterInternalFrame view) {
    String noKtp = GeneralHelper.validasiNullString(view.getTxtNoKtpPelanggan().getText());
    String nama = GeneralHelper.validasiNullString(view.getTxtNamaPelanggan().getText());
    String jenisKelamin = view.getCbJenisKelaminPelanggan().getSelectedItem().toString();
    String noHp = GeneralHelper.validasiNullString(view.getTxtNoHpPelanggan().getText());
    String jenisPelanggan = view.getCbJenisPelanggan().getSelectedItem().toString();
    String alamat = GeneralHelper.validasiNullString(view.getTxtAlamatPelanggan().getText());

    MasterPelangganModel model = new MasterPelangganModel();
    model.setNoKtp(noKtp);
    model.setNama(nama);
    model.setJenisKelamin(jenisKelamin);
    model.setNoHp(noHp);
    model.setJenisPelanggan(jenisPelanggan);
    model.setAlamat(alamat);

    masterPelangganService.save(model);
    loadMasterPelangganData(view);
  }

}
