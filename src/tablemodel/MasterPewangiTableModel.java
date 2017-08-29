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
package tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.MasterPewangiModel;

/**
 *
 * @author triastowo
 */
public class MasterPewangiTableModel extends AbstractTableModel {

  private List<MasterPewangiModel> list;
  private final String HEADER[] = {"No", "ID Pewangi", "Nama", "Harga"};

  public void setList(List<MasterPewangiModel> list) {
    this.list = list;
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

  // "No", "ID Pewangi", "Nama", "Harga"
  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
      case 0:
        return rowIndex + 1;
      case 1:
        return list.get(rowIndex).getIdPewangi();
      case 2:
        return list.get(rowIndex).getNamaPewangi();
      case 3:
        return list.get(rowIndex).getHarga();
      default:
        return null;
    }
  }

}
