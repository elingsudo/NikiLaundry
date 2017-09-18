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

  public LaundryPenyerahanController() {
    pewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);
    layananService = new MasterLayananServiceImpl(MasterLayananModel.class);
  }

  public void loadPenyerehanData(LaundryInternalFrame view) {
    view.getCbPewangiPenyerahan().removeAllItems();
    List<MasterPewangiModel> listPewangi = pewangiService.findAll();
    for (MasterPewangiModel masterPewangiModel : listPewangi) {
      view.getCbPewangiPenyerahan().addItem(masterPewangiModel.getNamaPewangi());
    }
  }
  
}
