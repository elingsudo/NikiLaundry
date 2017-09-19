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

import implementation.master.MasterLayananServiceImpl;
import implementation.master.MasterPakaianImplementation;
import implementation.master.MasterPelangganImplementation;
import implementation.master.MasterPewangiImplementation;
import java.math.BigDecimal;
import model.master.MasterLayananModel;
import model.master.MasterPakaianModel;
import model.master.MasterPelangganModel;
import model.master.MasterPewangiModel;
import service.master.MasterLayananService;
import service.master.MasterPakaianService;
import service.master.MasterPelangganService;
import service.master.MasterPewangiService;

/**
 *
 * @author Me
 */
public class InitialDB {

  private final MasterPelangganService pelangganService;
  private final MasterLayananService layananService;
  private final MasterPakaianService pakaianService;
  private final MasterPewangiService pewangiService;

  public InitialDB() {
    pelangganService = new MasterPelangganImplementation(MasterPelangganModel.class);
    layananService = new MasterLayananServiceImpl(MasterLayananModel.class);
    pakaianService = new MasterPakaianImplementation(MasterPakaianModel.class);
    pewangiService = new MasterPewangiImplementation(MasterPewangiModel.class);
  }

  public static void init() {
    InitialDB initialDB = new InitialDB();
    initialDB.insertPelanggan();
    initialDB.insertMasterLayanan();
    initialDB.insertMasterPakaian();
    initialDB.insertMasterPewangi();
  }

  private void insertPelanggan() {
    MasterPelangganModel pelanggan = new MasterPelangganModel();
    pelanggan.setNoKtp("330400_990333_0001");
    pelanggan.setNama("Eling");
    pelanggan.setJenisKelamin("L");
    pelanggan.setNoHp("085444999333");
    pelanggan.setJenisPelanggan("MEMBER");
    pelanggan.setAlamat("alamat");
    String message = pelangganService.save(pelanggan);
    System.out.println(message);
  }

  private void insertMasterLayanan() {
    MasterLayananModel layanan = new MasterLayananModel();
    layanan.setIdLayanan("0001");
    layanan.setNamaLayanan("Standart");
    layanan.setHarga(new BigDecimal("3500"));
    String message = layananService.save(layanan);
    System.out.println(message);
    
    MasterLayananModel layananKilat = new MasterLayananModel();
    layananKilat.setIdLayanan("0002");
    layananKilat.setNamaLayanan("Kilat");
    layananKilat.setHarga(new BigDecimal("5000"));
    String messageKilat = layananService.save(layananKilat);
    System.out.println(messageKilat);
  }

  private void insertMasterPakaian() {
    MasterPakaianModel pakaian = new MasterPakaianModel();
    pakaian.setIdPakaian("0100");
    pakaian.setNamaPakaian("Kaos");
    pakaian.setHarga(new BigDecimal("1000"));
    String message = pakaianService.save(pakaian);
    System.out.println(message);
  }

  private void insertMasterPewangi() {
    MasterPewangiModel pewangi = new MasterPewangiModel();
    pewangi.setIdPewangi("0101");
    pewangi.setNamaPewangi("Downy");
    pewangi.setHarga(new BigDecimal("5000"));
    String message = pewangiService.save(pewangi);
    System.out.println(message);
    
    MasterPewangiModel pewangiMolto = new MasterPewangiModel();
    pewangiMolto.setIdPewangi("0102");
    pewangiMolto.setNamaPewangi("Molto");
    pewangiMolto.setHarga(new BigDecimal("3000"));
    String messageMolto = pewangiService.save(pewangiMolto);
    System.out.println(messageMolto);
  }
}
