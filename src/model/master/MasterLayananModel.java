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
package model.master;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @author triastowo
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MasterLayananModel implements Serializable {

  @Id
  @GeneratedValue
  private int id;

  private String idLayanan;

  private String namaLayanan;

  private BigDecimal harga;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getIdLayanan() {
    return idLayanan;
  }

  public void setIdLayanan(String idLayanan) {
    this.idLayanan = idLayanan;
  }

  public String getNamaLayanan() {
    return namaLayanan;
  }

  public void setNamaLayanan(String namaLayanan) {
    this.namaLayanan = namaLayanan;
  }

  public BigDecimal getHarga() {
    return harga;
  }

  public void setHarga(BigDecimal harga) {
    this.harga = harga;
  }

  @Override
  public String toString() {
    return "MasterLayananModel{" + "id=" + id + ", idLayanan=" + idLayanan
            + ", namaLayanan=" + namaLayanan + ", harga=" + harga + '}';
  }

}
