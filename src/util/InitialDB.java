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
package util;

import implementation.MasterPelangganImplementation;
import model.MasterPelanggan;
import service.MasterPelangganService;

/**
 *
 * @author Me
 */
public class InitialDB {

  private final MasterPelangganService service;

  public InitialDB() {
    service = new MasterPelangganImplementation(MasterPelanggan.class);
  }

  public static void init() {
    InitialDB initialDB = new InitialDB();
    initialDB.insertPelanggan();
  }

  private void insertPelanggan() {
    MasterPelanggan pelanggan = new MasterPelanggan();
    pelanggan.setNoKtp("330400_990333_0001");
    pelanggan.setJenisKelamin("L");
    pelanggan.setNama("Eling");
    pelanggan.setAlamat("alamat");
    pelanggan.setNoHp("085444999333");
    pelanggan.setJenisPelanggan("MEMBER");
    String message = service.save(pelanggan);
    System.out.println(message);
  }
}
