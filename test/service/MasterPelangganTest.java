/*
 * Copyright (C) 2017 Me
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

import service.master.MasterPelangganService;
import implementation.master.MasterPelangganImplementation;
import model.master.MasterPelangganModel;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Me
 */
public class MasterPelangganTest {

  private final MasterPelangganService penggunaService;

  public MasterPelangganTest() {
    penggunaService = new MasterPelangganImplementation(MasterPelangganModel.class);
  }

  @Test
  public void insertPelangganTest() {
    MasterPelangganModel pelangganBaru = new MasterPelangganModel();
    pelangganBaru.setNoKtp("330400_990333_0001");
    pelangganBaru.setJenisKelamin("L");
    pelangganBaru.setNama("Eling");
    pelangganBaru.setAlamat("alamat");
    pelangganBaru.setNoHp("085444999333");
    pelangganBaru.setJenisPelanggan("MEMBER");
    penggunaService.save(pelangganBaru);
    Assert.assertEquals("Eling", pelangganBaru.getNama());
  }

  @Test
  public void findOneByIDTest() {
    MasterPelangganModel pelangganBaru = new MasterPelangganModel();
    pelangganBaru.setNoKtp("330400_990333_0001");
    pelangganBaru.setJenisKelamin("L");
    pelangganBaru.setNama("Eling");
    pelangganBaru.setAlamat("alamat");
    pelangganBaru.setNoHp("085444999333");
    pelangganBaru.setJenisPelanggan("MEMBER");
    penggunaService.save(pelangganBaru);
    Assert.assertEquals("Eling", pelangganBaru.getNama());

    MasterPelangganModel pelanggan = penggunaService.findOneByNama("Eling");
    Assert.assertEquals("Eling", pelanggan.getNama());
  }

}
