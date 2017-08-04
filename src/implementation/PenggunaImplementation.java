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
package implementation;

import model.Pengguna;
import org.hibernate.Session;
import service.PenggunaService;
import util.HibernateUtil;

/**
 *
 * @author Me
 */
public class PenggunaImplementation extends AbstractImplementation<Pengguna> implements PenggunaService {

  public PenggunaImplementation(Class<Pengguna> model) {
    super(model);
  }

  @Override
  public Pengguna findOneByNama(String nama) {
    Pengguna pengguna = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      pengguna = (Pengguna) session.createQuery("FROM Pengguna pengguna WHERE pengguna.nama = :nama")
              .setString("nama", nama).uniqueResult();
      session.getTransaction().commit();
    } catch (Exception e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return pengguna;
  }
}
