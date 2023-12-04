
package bll.services;

import gui.models.NhanVien.ChucVuModel;
import gui.models.NhanVien.CreateChucVuModel;
import gui.models.NhanVien.UpdateChucVuModel;
import java.util.List;


public interface IChucVuService {
    List<ChucVuModel> getAll();
    
    ChucVuModel getById(int id);
    
    boolean createChucVu(CreateChucVuModel createChucVuModel);
   
    boolean updateChucVu(UpdateChucVuModel updateChucVuModel);
    
    boolean deleteChucVu(int idChucVu);
   
}
