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
package implementation.master;

import implementation.AbstractImplementation;
import model.master.MasterPakaianModel;
import service.master.MasterPakaianService;

/**
 *
 * @author triastowo
 */
public class MasterPakaianImplementation
        extends AbstractImplementation<MasterPakaianModel> implements MasterPakaianService {

  public MasterPakaianImplementation(Class<MasterPakaianModel> model) {
    super(model);
  }

}
