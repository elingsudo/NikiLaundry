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
package tablemodel.laundry;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.laundry.PenyerahanModel;

/**
 *
 * @author triastowo
 */
public class LaundryPenyerahanTableModel extends AbstractTableModel {

  private List<PenyerahanModel> list;
  private final String HEADER[] = {
    "No", "Nama", "No Nota", "Pewangi", "Tanggal Terima", "Tanggal Jadi", "Jumlah"
  };

  public void setList(List<PenyerahanModel> list) {
    this.list = list;
    fireTableDataChanged();
  }

  @Override
  public String getColumnName(int column) {
    return HEADER[column];
  }

  @Override
  public int getRowCount() {
    return list.size();
  }

  @Override
  public int getColumnCount() {
    return HEADER.length;
  }

  // "No", "Nama", "No Nota", "Pewangi", "Tanggal Terima", "Tanggal Jadi", "Jumlah"
  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
      case 0:
        return rowIndex + 1;
      case 1:
        return list.get(rowIndex).getNama();
      case 2:
        return list.get(rowIndex).getNoNota();
      case 3:
        return list.get(rowIndex).getPewangi();
      case 4:
        return list.get(rowIndex).getTanggalTerima();
      case 5:
        return list.get(rowIndex).getTanggalJadi();
      case 6:
        return list.get(rowIndex).getJumlah();
      default:
        return null;
    }
  }

}
