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
package model.laundry;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author triastowo
 */
@Entity
public class PenyerahanModel implements Serializable {

  @Id
  @GeneratedValue
  private int id;

  private String nama;
  private String noNota;
  private String pewangi;
  private String layanan;

  @Temporal(TemporalType.DATE)
  private Date tanggalTerima;

  @Temporal(TemporalType.DATE)
  private Date tanggalJadi;

  private String jumlah;

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNoNota() {
    return noNota;
  }

  public void setNoNota(String noNota) {
    this.noNota = noNota;
  }

  public String getPewangi() {
    return pewangi;
  }

  public void setPewangi(String pewangi) {
    this.pewangi = pewangi;
  }

  public String getLayanan() {
    return layanan;
  }

  public void setLayanan(String layanan) {
    this.layanan = layanan;
  }

  public Date getTanggalTerima() {
    return tanggalTerima;
  }

  public void setTanggalTerima(Date tanggalTerima) {
    this.tanggalTerima = tanggalTerima;
  }

  public Date getTanggalJadi() {
    return tanggalJadi;
  }

  public void setTanggalJadi(Date tanggalJadi) {
    this.tanggalJadi = tanggalJadi;
  }

  public String getJumlah() {
    return jumlah;
  }

  public void setJumlah(String jumlah) {
    this.jumlah = jumlah;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
