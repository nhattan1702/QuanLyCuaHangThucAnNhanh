
package bll.services;

import gui.models.HoaDon.ChiTietHoaDonModel;
import java.util.List;


public interface IChiTietHoaDonService  {
    public List<ChiTietHoaDonModel> getAllChiTietHoaDonByIdHoaDon(int idHoaDon);
}
