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

import implementation.PenggunaImplementation;
import model.Pengguna;
import service.PenggunaService;

/**
 *
 * @author Me
 */
public class InitialDB {

  private final PenggunaService service;

  public InitialDB() {
    service = new PenggunaImplementation(Pengguna.class);
  }

  public static void init() {
    InitialDB initialDB = new InitialDB();
    initialDB.insertMember();
  }

  private void insertMember() {
    Pengguna pengguna = new Pengguna();
    pengguna.setId(1);
    pengguna.setUsername("username");
    pengguna.setPassword("password");
    pengguna.setNama("nama");
    pengguna.setAlamat("alamat");
    pengguna.setNoHp("hp");
    pengguna.setIsMember(true);
    String message = service.save(pengguna);
    System.out.println(message);
  }
}
