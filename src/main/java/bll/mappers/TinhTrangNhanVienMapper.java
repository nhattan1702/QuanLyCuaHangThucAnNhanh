
package bll.mappers;

import dal.entity.TinhTrangNhanVien;
import gui.models.NhanVien.TinhTrangNhanVienModel;
import java.util.ArrayList;
import java.util.List;


public class TinhTrangNhanVienMapper {
     public static TinhTrangNhanVienModel toTinhTrangNhanVienModel(TinhTrangNhanVien tinhTrangNhanVien){
        TinhTrangNhanVienModel tinhTrangNhanVienModel = new TinhTrangNhanVienModel(tinhTrangNhanVien.getId(), tinhTrangNhanVien.getTen());
        
        return tinhTrangNhanVienModel;
    }
    
    
 public static List<TinhTrangNhanVienModel> toListTinhTrangNhanVienModel(List<TinhTrangNhanVien> listTinhTrangNhanVien){
        List<TinhTrangNhanVienModel> listTinhTrangNhanVienModel = new ArrayList<>();
        listTinhTrangNhanVien.forEach(tinhTrangNhanVien -> listTinhTrangNhanVienModel.add(toTinhTrangNhanVienModel(tinhTrangNhanVien)));
        
        return listTinhTrangNhanVienModel;
    }   
    
}
