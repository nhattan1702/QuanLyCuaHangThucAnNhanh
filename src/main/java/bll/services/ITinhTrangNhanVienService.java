
package bll.services;

import gui.models.NhanVien.TinhTrangNhanVienModel;
import java.util.List;




public interface ITinhTrangNhanVienService {
    List<TinhTrangNhanVienModel> getAll();
    
    TinhTrangNhanVienModel getById(int id);
    
}
