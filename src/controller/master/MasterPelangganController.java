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

import implementation.MasterPelangganImplementation;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import model.MasterPelangganModel;
import service.MasterPelangganService;
import tablemodel.MasterPelangganTableModel;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterPelangganController {

  private final MasterPelangganService masterPelangganService;
  private final MasterPelangganTableModel tableModel;

  public MasterPelangganController() {
    masterPelangganService = new MasterPelangganImplementation(MasterPelangganModel.class);
    tableModel = new MasterPelangganTableModel();
  }

  public void tabMasterStateChange(MasterInternalFrame view, ChangeEvent evt) {
    if (evt.getSource() instanceof JTabbedPane) {
       JTabbedPane pane = (JTabbedPane) evt.getSource();
       switch (pane.getSelectedIndex()) {
         case 0:
           this.loadMasterPelangganData(view);
           break;
         case 1:
           System.out.println(1);
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
  private void loadMasterPelangganData(MasterInternalFrame view) {
    List<MasterPelangganModel> findAll = masterPelangganService.findAll();
    tableModel.setList(findAll);
    view.getTabelPelanggan().setModel(tableModel);
  }

}
