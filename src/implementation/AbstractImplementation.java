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

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import service.AbstractService;
import util.HibernateUtil;

/**
 *
 * @author Me
 * @param <T>
 */
public class AbstractImplementation<T> extends HibernateUtil implements AbstractService<T> {

  protected Class<T> model;

  public AbstractImplementation(Class<T> model) {
    this.model = model;
  }

  /**
   *
   * @param t
   * @return
   */
  @Override
  public String save(T t) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      session.save(t);
      session.getTransaction().commit();
    } catch (Exception e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return t.toString();
  }

  /**
   *
   * @param t
   * @return
   */
  @Override
  public String update(T t) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      session.update(t);
      session.getTransaction().commit();
    } catch (Exception e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return t.toString();
  }

  /**
   *
   * @param t
   * @return
   */
  @Override
  public String delete(T t) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      session.delete(t);
      session.getTransaction().commit();
    } catch (Exception e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return t.toString();
  }

  /**
   *
   * @param id
   * @return
   */
  @Override
  public T findOneById(int id) {
    T t = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      t = (T) session.get((Class) t, id);
      session.getTransaction().commit();
    } catch (Exception e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return t;
  }

  /**
   *
   * @return list
   */
  @Override
  @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
  public List<T> findAll() {
    List<T> list = new ArrayList<>();
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      list = session.createCriteria(model).list();
      session.getTransaction().commit();
    } catch (HibernateException e) {
      session.getTransaction().rollback();
      System.out.println(e.getMessage());
      throw e;
    } finally {
      session.close();
    }
    return list;
  }

}
