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

import implementation.PenggunarImplementation;
import model.Pengguna;
import org.junit.Test;

/**
 *
 * @author Me
 */
public class MemberTest {

  private final PenggunaService memberService;

  public MemberTest() {
    memberService = new PenggunarImplementation();
  }

  @Test
  public void insertMemberTest() {
    Pengguna member = new Pengguna();
    member.setNama("NAMA");
    member.setAlamat("ALAMAT");
    member.setNoHp("089000000");
    member.setPassword("PASSWORD");
    member.setUsername("USERNAME");
    System.out.println(memberService.save(member));
  }

}
