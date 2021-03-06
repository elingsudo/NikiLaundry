/*
 * Copyright (C) 2017 triastowo
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
package helper;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <p> Class yang digunakan untuk meng-generate angka acak </p>
 *
 * @author triastowo
 */
public class IDGenerator {

   /**
    * generate ID User untuk penyerahan
    *
    * @return random bilangan integer
    */
   public static Integer generateUserID() {
      return ThreadLocalRandom.current().nextInt(100_000, 999_999 + 1);
   }

   /**
    * generate No Nota untuk penyerahan
    *
    * @return random bilangan integer
    */
   public static Integer generateNoNota() {
      return ThreadLocalRandom.current().nextInt(100_000, 999_999 + 1);
   }

}