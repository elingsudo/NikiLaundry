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

import implementation.MasterPelangganImplementation;
import model.MasterPelanggan;
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
    penggunaService = new MasterPelangganImplementation(MasterPelanggan.class);
  }

  @Test
  public void insertPelangganTest() {
    MasterPelanggan pelangganBaru = new MasterPelanggan();
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
    MasterPelanggan pelangganBaru = new MasterPelanggan();
    pelangganBaru.setNoKtp("330400_990333_0001");
    pelangganBaru.setJenisKelamin("L");
    pelangganBaru.setNama("Eling");
    pelangganBaru.setAlamat("alamat");
    pelangganBaru.setNoHp("085444999333");
    pelangganBaru.setJenisPelanggan("MEMBER");
    penggunaService.save(pelangganBaru);
    Assert.assertEquals("Eling", pelangganBaru.getNama());

    MasterPelanggan pelanggan = penggunaService.findOneByNama("Eling");
    Assert.assertEquals("Eling", pelanggan.getNama());
  }

}
