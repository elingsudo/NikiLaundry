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
package tablemodel.master;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.master.MasterLayananModel;

/**
 *
 * @author triastowo
 */
public class MasterLayananTableModel extends AbstractTableModel {

  private List<MasterLayananModel> list;
  private final String HEADER[] = {"No", "Id Layanan", "Nama Layanan", "Harga"};

  public void setList(List<MasterLayananModel> list) {
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

  // "No", "Id Layanan", "Nama Layanan", "Harga"
  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
      case 0:
        return rowIndex + 1;
      case 1:
        return list.get(rowIndex).getIdLayanan();
      case 2:
        return list.get(rowIndex).getNamaLayanan();
      case 3:
        return list.get(rowIndex).getHarga();
      default:
        return null;
    }
  }

}
