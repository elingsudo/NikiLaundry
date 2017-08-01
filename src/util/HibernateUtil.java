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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author Me
 */
public class HibernateUtil {

  private static final SessionFactory SESSION_FACTORY;
  
  static {
    try {
      URL url = HibernateUtil.class.getResource("/hibernate.cfg.xml");
      Configuration configuration = new Configuration().configure(url);

      InputStream is = HibernateUtil.class.getResourceAsStream("/database.properties");
      Properties props = new Properties();
      props.load(is);
      configuration.addProperties(props);

      // Create the SessionFactory from standard (hibernate.cfg.xml)
      // config file.
      SESSION_FACTORY = configuration.buildSessionFactory();
    } catch (IOException | HibernateException ex) {
      // Log the exception.
      System.err.println("Initial SessionFactory creation failed." + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
  
  /* PUBLIC */
  
  public static SessionFactory getSessionFactory() {
    return SESSION_FACTORY;
  }

  
  public static void constructConfiguration() {
    if (!SESSION_FACTORY.isClosed()) {
      System.out.println("Initial Session Factory");
    } else {
      System.out.println("Re-Initial Session Factory");
    }
  }

}
