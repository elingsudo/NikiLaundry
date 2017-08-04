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

import implementation.PenggunaImplementation;
import model.Pengguna;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Me
 */
public class PenggunaTest {

  private final PenggunaService penggunaService;

  public PenggunaTest() {
    penggunaService = new PenggunaImplementation(Pengguna.class);
  }

  @Test
  public void insertPenggunaTest() {
    Pengguna penggunaBaru = new Pengguna();
    penggunaBaru.setNama("FANI");
    penggunaBaru.setAlamat("ALAMAT");
    penggunaBaru.setNoHp("089000000");
    penggunaBaru.setPassword("PASSWORD");
    penggunaBaru.setUsername("USERNAME");
    penggunaBaru.setIsMember(true);
    penggunaService.save(penggunaBaru);
    Assert.assertEquals("FANI", penggunaBaru.getNama());
  }

  @Test
  public void findOneByIDTest() {
    Pengguna penggunaBaru = new Pengguna();
    penggunaBaru.setNama("FANI");
    penggunaBaru.setAlamat("ALAMAT");
    penggunaBaru.setNoHp("089000000");
    penggunaBaru.setPassword("PASSWORD");
    penggunaBaru.setUsername("USERNAME");
    penggunaBaru.setIsMember(true);
    penggunaService.save(penggunaBaru);

    Pengguna pengguna = penggunaService.findOneByNama("FANI");
    Assert.assertEquals(1, pengguna.getId());
  }

}
