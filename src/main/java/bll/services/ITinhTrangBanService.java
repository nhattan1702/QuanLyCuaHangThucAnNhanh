package bll.services;

import dal.entity.TinhTrangBan;
import gui.models.Ban.TinhTrangBanModel;
import java.util.List;


public interface ITinhTrangBanService {
    List<TinhTrangBanModel> getAll();
    
    TinhTrangBanModel getById(int idTinhTrangBan);
}
