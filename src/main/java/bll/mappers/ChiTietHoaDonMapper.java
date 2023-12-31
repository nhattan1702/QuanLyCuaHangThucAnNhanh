
package bll.mappers;

import dal.entity.ChiTietHoaDon;
import gui.models.HoaDon.ChiTietHoaDonModel;
import gui.models.MonAn.MonAnModel;
import java.util.ArrayList;
import java.util.List;


public class ChiTietHoaDonMapper {
    public static ChiTietHoaDonModel toChiTietHoaDonModel(ChiTietHoaDon chiTietHoaDon){
        ChiTietHoaDonModel chiTietHoaDonModel = new ChiTietHoaDonModel();
        
        MonAnModel monAnModel = MonAnMapper.toMonAnModel(chiTietHoaDon.getMonAn());
        chiTietHoaDonModel.setTenMonAn(monAnModel.getTen());
//        chiTietHoaDonModel.setTenMonAn(chiTietHoaDon.getMonAn().getTen());
        chiTietHoaDonModel.setSoLuong(chiTietHoaDon.getSoLuong());
        chiTietHoaDonModel.setGia(chiTietHoaDon.getDonGia());
        
        
        return chiTietHoaDonModel;
    }
    
    public static List<ChiTietHoaDonModel> toListChiTietHoaDonModel(List<ChiTietHoaDon> listChiTietHoaDon){
        List<ChiTietHoaDonModel> listChiTietHoaDonModel = new ArrayList<>();
        listChiTietHoaDon.forEach(chiTietHoaDon -> listChiTietHoaDonModel.add(toChiTietHoaDonModel(chiTietHoaDon)));
        
        return listChiTietHoaDonModel;
    }
}
