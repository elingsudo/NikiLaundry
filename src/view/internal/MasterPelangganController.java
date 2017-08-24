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
package view.internal;

import implementation.MasterLayananServiceImpl;
import implementation.MasterPakaianImplementation;
import implementation.MasterPelangganImplementation;
import implementation.MasterPewangiImplementation;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import model.MasterLayananModel;
import model.MasterPakaianModel;
import model.MasterPelangganModel;
import model.MasterPewangiModel;
import service.MasterLayananService;
import service.MasterPakaianService;
import service.MasterPelangganService;
import service.MasterPewangiService;

/**
 *
 * @author triastowo
 */
public class MasterPelangganController {

  private final MasterPelangganService masterPelangganService;
  private final MasterPewangiService masterPewangiService;
  private final MasterLayananService masterLayananService;
  private final MasterPakaianService masterPakaianService;

  public MasterPelangganController() {
    masterPelangganService = new MasterPelangganImplementation(MasterPelangganModel.class);
    masterPewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);
    masterLayananService = new MasterLayananServiceImpl(MasterLayananModel.class);
    masterPakaianService = new MasterPakaianImplementation(MasterPakaianModel.class);
  }

}
