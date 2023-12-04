
package bll.services.impl;

import bll.mappers.ChiTietHoaDonMapper;
import dal.repository.ChiTietHoaDonRepository;
import gui.models.HoaDon.ChiTietHoaDonModel;
import java.util.List;
import bll.services.IChiTietHoaDonService;
import dal.entity.ChiTietHoaDon;


public class ChiTietHoaDonServiceImpl implements IChiTietHoaDonService {
    ChiTietHoaDonRepository chiTietHoaDonRepository ;
    
    public ChiTietHoaDonServiceImpl (){
        chiTietHoaDonRepository = new ChiTietHoaDonRepository();
    }
    
    @Override
    public List<ChiTietHoaDonModel> getAllChiTietHoaDonByIdHoaDon(int idHoaDon) {
        List<ChiTietHoaDon> listChiTietHoaDon = chiTietHoaDonRepository.getAllChiTietHoaDonById(idHoaDon);
        List<ChiTietHoaDonModel> listChiTietHoaDonModel = ChiTietHoaDonMapper.toListChiTietHoaDonModel(listChiTietHoaDon);
        
        for(ChiTietHoaDonModel chiTietHoaDonModel : listChiTietHoaDonModel) {
            chiTietHoaDonModel.setThanhTien(chiTietHoaDonModel.getGia() * chiTietHoaDonModel.getSoLuong());
        }
        
        return listChiTietHoaDonModel;
    }
}
