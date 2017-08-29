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

import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import view.internal.MasterInternalFrame;

/**
 *
 * @author triastowo
 */
public class MasterController {
  
  private final MasterPelangganController masterPelangganController;
  private final MasterPewangiController masterPewangiController;
  private final MasterPakaianController masterPakaianController;
  private final MasterLayananController masterLayananController;

  public MasterController() {
    masterPelangganController = new MasterPelangganController();
    masterPewangiController = new MasterPewangiController();
    masterPakaianController = new MasterPakaianController();
    masterLayananController = new MasterLayananController();
  }

  public void tabMasterStateChange(MasterInternalFrame view, ChangeEvent evt) {
    if (evt.getSource() instanceof JTabbedPane) {
      JTabbedPane pane = (JTabbedPane) evt.getSource();
      switch (pane.getSelectedIndex()) {
        case 0:
          masterPelangganController.loadMasterPelangganData(view);
          break;
        case 1:
          masterPewangiController.loadMasterPewangiData(view);
          break;
        case 2:
          masterPakaianController.loadMasterPakaianData(view);
          break;
        case 3:
          masterLayananController.loadMasterLayananData(view);
          break;
      }
    }
  }

}
