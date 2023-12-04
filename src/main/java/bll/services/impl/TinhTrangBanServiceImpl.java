package bll.services.impl;

import bll.mappers.TinhTrangBanMapper;
import bll.services.ITinhTrangBanService;
import dal.entity.TinhTrangBan;
import dal.repository.TinhTrangBanRepository;
import gui.models.Ban.TinhTrangBanModel;
import java.util.List;


public class TinhTrangBanServiceImpl implements ITinhTrangBanService{
    
    TinhTrangBanRepository tinhTrangBanRepository;

    public TinhTrangBanServiceImpl() {
        tinhTrangBanRepository = new TinhTrangBanRepository();
    }
    
    @Override
    public List<TinhTrangBanModel> getAll() {
        List<TinhTrangBan> listTinhTrangBan = tinhTrangBanRepository.getAll();
        List<TinhTrangBanModel> listTinhTrangBanModel = TinhTrangBanMapper.toListTinhTrangBanModel(listTinhTrangBan);
                
        return listTinhTrangBanModel;        
    }

    @Override
    public TinhTrangBanModel getById(int idTinhTrangBan) {
        TinhTrangBan tinhTrangBan = tinhTrangBanRepository.getById(idTinhTrangBan);
        TinhTrangBanModel tinhTrangBanModel = TinhTrangBanMapper.toTinhTrangBanModel(tinhTrangBan);
        
        return tinhTrangBanModel;
    }
    
}
