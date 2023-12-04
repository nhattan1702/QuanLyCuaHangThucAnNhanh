
package bll.services;

import gui.models.LoaiKhachHang.CreateLoaiKhachHangModel;
import gui.models.LoaiKhachHang.LoaiKhachHangModel;
import gui.models.LoaiKhachHang.UpdateLoaiKhachHangModel;
import java.util.List;


public interface ILoaiKhachHangService {
    List<LoaiKhachHangModel> getAll();
    
    LoaiKhachHangModel getById(int id);
    
    boolean createLoaiKhachHang(CreateLoaiKhachHangModel createLoaiKhachHangModel);
    
    boolean updateLoaiKhachHang(UpdateLoaiKhachHangModel updateLoaiKhachHangModel);
    
    boolean delete(int id);
}
