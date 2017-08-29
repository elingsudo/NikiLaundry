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
package implementation.master;

import implementation.AbstractImplementation;
import model.master.MasterPelangganModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import service.master.MasterPelangganService;

/**
 *
 * @author Me
 */
public class MasterPelangganImplementation
        extends AbstractImplementation<MasterPelangganModel>
        implements MasterPelangganService {

  public MasterPelangganImplementation(Class<MasterPelangganModel> model) {
    super(model);
  }

  @Override
  public MasterPelangganModel findOneByNama(String nama) {
    MasterPelangganModel pengguna = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      pengguna = (MasterPelangganModel) session.createCriteria(MasterPelangganModel.class)
              .add(Restrictions.like("nama", "%" + nama + "%"))
              .uniqueResult();
      session.getTransaction().commit();
    } catch (HibernateException e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return pengguna;
  }
}
