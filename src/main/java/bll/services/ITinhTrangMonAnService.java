package bll.services;

import dal.entity.TinhTrangMonAn;
import gui.models.MonAn.TinhTrangMonAnModel;
import java.util.List;


public interface ITinhTrangMonAnService {
    List<TinhTrangMonAnModel> getAll();
    
    TinhTrangMonAnModel getById(int id);
}
