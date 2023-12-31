
package bll.services.impl;

import bll.mappers.ChucVuMapper;
import bll.services.IChucVuService;
import dal.entity.ChucVu;
import dal.repository.ChucVuRepository;
import gui.models.NhanVien.ChucVuModel;
import gui.models.NhanVien.CreateChucVuModel;
import gui.models.NhanVien.UpdateChucVuModel;
import java.util.List;


public class ChucVuServiceImpl implements IChucVuService {
    
    private final ChucVuRepository chucVuRepository;
    
       public ChucVuServiceImpl(){
       chucVuRepository = new ChucVuRepository();
    }
    
    
    
    @Override
    public List<ChucVuModel> getAll() {
       List<ChucVu> listChucVu = chucVuRepository.getAll();
       List<ChucVuModel> listChucVuModel = ChucVuMapper.toListChucVuModel(listChucVu);
       
       return listChucVuModel;
    }

    @Override
    public ChucVuModel getById(int id) {
       ChucVu chucVu = chucVuRepository.getById(id);
       ChucVuModel chucVuModel = ChucVuMapper.toChucVuModel(chucVu);
       
       return chucVuModel;
    }

    @Override
    public boolean createChucVu(CreateChucVuModel createChucVuModel) {
       ChucVu chucVu = ChucVuMapper.toChucVu(createChucVuModel);
       
       if(!validateCreate(chucVu))
            return false;
       
       ChucVu createChucVu = chucVuRepository.createChucVu(chucVu);
        
       if (createChucVu.getId() > 0)
           return true;
       return false;
      
    }

    @Override
    public boolean updateChucVu(UpdateChucVuModel updateChucVuModel) {
       ChucVu chucVu = ChucVuMapper.toChucVu(updateChucVuModel);
       
       if(!validateUpdate(chucVu))
           return false;
       
       ChucVu updaChucVu = chucVuRepository.updateChucVu(chucVu);
       
       return true;
           
    }

    @Override
    public boolean deleteChucVu(int idChucVu) {
        chucVuRepository.deleteChucVu(idChucVu);
        
        return true;
    }
    
    
    public boolean validateCreate(ChucVu chucVu){
        return chucVuRepository.getByName(chucVu.getTen()) == null;
    }
    
    public boolean validateUpdate(ChucVu chucVu){
        ChucVu chucVuCheck = chucVuRepository.getByName(chucVu.getTen());
        return chucVuCheck == null || chucVuCheck.getId() == chucVu.getId();
    }
    
}
