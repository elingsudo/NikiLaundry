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

import implementation.MemberImplementation;
import model.Member;
import service.MemberService;

/**
 *
 * @author Me
 */
public class InitialDB {

  private final MemberService service;

  public InitialDB() {
    service = new MemberImplementation();
  }
  
  public static void init() {
    InitialDB initialDB = new InitialDB();
    initialDB.insertMember();
  }

  private void insertMember() {
    Member member = new Member();
    member.setUsername("username");
    member.setPassword("password");
    member.setNama("nama");
    member.setAlamat("alamat");
    member.setNoHp("hp");
    String message = service.save(member);
    System.out.println(message);
  }
}
