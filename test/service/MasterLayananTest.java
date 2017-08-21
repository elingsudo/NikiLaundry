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

import implementation.MasterLayananServiceImpl;
import java.math.BigDecimal;
import model.MasterLayananModel;
import org.junit.Test;

/**
 *
 * @author triastowo
 */
public class MasterLayananTest {

  private final MasterLayananService service;

  public MasterLayananTest() {
    service = new MasterLayananServiceImpl(MasterLayananModel.class);
  }
  
  @Test
  public void insertLayananTest() {
    MasterLayananModel model = new MasterLayananModel();
    model.setIdLayanan("1324");
    model.setNamaLayanan("Layanan Cepat");
    model.setHarga(new BigDecimal("4000"));
    service.save(model);
  }
}
