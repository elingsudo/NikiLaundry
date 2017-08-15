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
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Me
 */
@Entity
public class MasterPelanggan implements Serializable {

  @Id
  @GeneratedValue
  private int id;

  @Column(name = "no_ktp")
  private String noKtp;
  private String nama;
  private String jenisKelamin;

  @Column(name = "no_hp")
  private String noHp;
  private String jenisPelanggan;

  private String alamat;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNoKtp() {
    return noKtp;
  }

  public void setNoKtp(String noKtp) {
    this.noKtp = noKtp;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getJenisKelamin() {
    return jenisKelamin;
  }

  public void setJenisKelamin(String jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public String getNoHp() {
    return noHp;
  }

  public void setNoHp(String noHp) {
    this.noHp = noHp;
  }

  public String getJenisPelanggan() {
    return jenisPelanggan;
  }

  public void setJenisPelanggan(String jenisPelanggan) {
    this.jenisPelanggan = jenisPelanggan;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  @Override
  public String toString() {
    return "MasterPelanggan{" + "id=" + id + ", noKtp=" + noKtp
            + ", nama=" + nama + ", jenisKelamin=" + jenisKelamin + ", noHp=" + noHp
            + ", jenisPelanggan=" + jenisPelanggan + ", alamat=" + alamat + '}';
  }

}
