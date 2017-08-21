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

import implementation.MasterPakaianImplementation;
import java.math.BigDecimal;
import model.MasterPakaianModel;
import org.junit.Test;

/**
 *
 * @author triastowo
 */
public class MasterPakaianTest {
  
  private final MasterPakaianService service;

  public MasterPakaianTest() {
    this.service = new MasterPakaianImplementation(MasterPakaianModel.class);
  }
  
  @Test
  public void insertPakaianTest() {
    MasterPakaianModel model = new MasterPakaianModel();
    model.setIdPakaian("1122");
    model.setNamaPakaian("Bubba");
    model.setHarga(new BigDecimal("100000"));
    service.save(model);
  }
  
}
