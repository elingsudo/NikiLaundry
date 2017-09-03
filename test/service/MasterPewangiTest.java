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
package service;

import service.master.MasterPewangiService;
import implementation.master.MasterPewangiImplementation;
import java.math.BigDecimal;
import model.master.MasterPewangiModel;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author triastowo
 */
public class MasterPewangiTest {

  private final MasterPewangiService service;

  public MasterPewangiTest() {
    service = new MasterPewangiImplementation(MasterPewangiModel.class);
  }

  @Test
  public void testInsertMasterPewangi() {
    MasterPewangiModel model = new MasterPewangiModel();
    model.setIdPewangi("01111");
    model.setNamaPewangi("So Clean");
    model.setHarga(new BigDecimal("10000"));
    String message = service.save(model);
    Assert.assertEquals("MasterPewangiModel{idPewangi=01111, namaPewangi=So Clean, harga=10000}", 
            message);
  }

}
