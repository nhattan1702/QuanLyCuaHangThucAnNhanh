
package gui.controllers;


import bll.services.ILoaiKhachHangService;
import bll.services.impl.LoaiKhachHangServiceImpl;
import gui.models.LoaiKhachHang.CreateLoaiKhachHangModel;
import gui.models.LoaiKhachHang.LoaiKhachHangModel;
import gui.models.LoaiKhachHang.UpdateLoaiKhachHangModel;
import gui.views.QuanLyLoaiKhachHang_GUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class QuanLyLoaiKhachHangController {
    private QuanLyLoaiKhachHang_GUI view;
    
    
    private final ILoaiKhachHangService loaiKhachHangService;
    private LoaiKhachHangModel loaiKhachHangSelected = null;
    private boolean dangThemLoaiKhachHang = true;
    public ArrayList<LoaiKhachHangModel> listLoaiKhachHangModel;

    public QuanLyLoaiKhachHangController() {
        loaiKhachHangService = new LoaiKhachHangServiceImpl();
        
        init();
    }
    
    public QuanLyLoaiKhachHang_GUI getView(){
        return view;
    }
    
    private void init(){
        view = new QuanLyLoaiKhachHang_GUI();
        view.setVisible(true);
        
        loadData();
        view.loadTableLoaiKhachHang(listLoaiKhachHangModel);
        
        view.btnThem.addActionListener(e -> changeModeLoaiKhachHang(true));
        view.btnSua.addActionListener(e -> changeModeLoaiKhachHang(false));
        view.btnXoa.addActionListener(e -> deleteLoaiKhachHang());
        view.btnLuu.addActionListener(e -> luuLoaiKhachHang());
        view.btnReset.addActionListener(e -> resetLoaiKhachHang());
        view.tblLoaiKH.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int selectedRow = view.tblLoaiKH.getSelectedRow();
                int selectedLoaiKHId = (int) view.tblLoaiKH.getValueAt(selectedRow, 0);
                
                loaiKhachHangSelected = loaiKhachHangService.getById(selectedLoaiKHId);

                if(!dangThemLoaiKhachHang)
                    loadDetailLoaiKhachHang();  
            }
        });
    }
    
    public void show(){
        view.setVisible(true);
        view.setState(JFrame.NORMAL);
        view.toFront();        
    }
    
    private void loadData(){
        listLoaiKhachHangModel = (ArrayList<LoaiKhachHangModel>) loaiKhachHangService.getAll();
    }

    private void changeModeLoaiKhachHang(boolean dangThemLoaiKhachHang){        
        this.dangThemLoaiKhachHang = dangThemLoaiKhachHang;
        
        view.btnThem.setEnabled(!dangThemLoaiKhachHang);
        view.btnSua.setEnabled(dangThemLoaiKhachHang);
        
        String titlePanel = dangThemLoaiKhachHang ? "Thêm loại khách hàng mới" : "Sửa loại khách hàng";
        view.pnlThemSuaLoaiKhachHang.setBorder(BorderFactory.createTitledBorder(titlePanel));
        view.pnlThemSuaLoaiKhachHang.repaint();
        resetLoaiKhachHang();
    }
    private void resetLoaiKhachHang(){     
        loadData();
        view.loadTableLoaiKhachHang(listLoaiKhachHangModel);
        loadDetailLoaiKhachHang();  
    }
    private void loadDetailLoaiKhachHang(){
        if(loaiKhachHangSelected == null || dangThemLoaiKhachHang){
            view.txtID.setText("");
            view.txtLoaiKH.setText("");
            view.txtDiemToiThieu.setText("");
            view.txtMucUuDai.setText("");
        } else {
            view.txtID.setText(Integer.toString(loaiKhachHangSelected.getId()));
            view.txtLoaiKH.setText(loaiKhachHangSelected.getTen());
            view.txtDiemToiThieu.setText(Integer.toString(loaiKhachHangSelected.getDiemToiThieu()));   
            view.txtMucUuDai.setText(Float.toString(loaiKhachHangSelected.getMucUuDai()));     
        }                  
    }
    private void luuLoaiKhachHang(){
        String error = kiemtraLuuLoaiKhachHang();
        if(error.length()> 0){
            JOptionPane.showMessageDialog(view, error,"Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String tenLoaiKhachHang = view.txtLoaiKH.getText().trim();
        int diemToiThieu = Integer.parseInt(view.txtDiemToiThieu.getText());
        float mucUuDai = Float.parseFloat(view.txtMucUuDai.getText());
        if(dangThemLoaiKhachHang){
            CreateLoaiKhachHangModel createLoaiKhachHangModel = new CreateLoaiKhachHangModel(tenLoaiKhachHang, diemToiThieu, mucUuDai);

            boolean result = loaiKhachHangService.createLoaiKhachHang(createLoaiKhachHangModel);
            if(result){
                JOptionPane.showMessageDialog(view, "Thêm loại khách hàng mới thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(view, "Thêm loại khách hàng mới thất bại","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        else {
            UpdateLoaiKhachHangModel updateLoaiKhachHangModel = new UpdateLoaiKhachHangModel(loaiKhachHangSelected.getId(), tenLoaiKhachHang, diemToiThieu, mucUuDai);

            boolean result = loaiKhachHangService.updateLoaiKhachHang(updateLoaiKhachHangModel);
            if(result){
                JOptionPane.showMessageDialog(view, "Sửa loại khách hàng thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loaiKhachHangSelected = loaiKhachHangService.getById(loaiKhachHangSelected.getId());
            }
            else{
                JOptionPane.showMessageDialog(view, "Sửa loại khách hàng thất bại","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        resetLoaiKhachHang();      
    }
    private String kiemtraLuuLoaiKhachHang(){
        ArrayList<String> errorList = new ArrayList<>();
        
        if(view.txtLoaiKH.getText().isBlank())
            errorList.add("Tên loại khách hàng không được để trống");
        int diemToiThieu;
        try{            
            diemToiThieu = Integer.parseInt(view.txtDiemToiThieu.getText());
        } catch (NumberFormatException ex) {
            errorList.add("Nhập sai định dạng điểm tối thiểu ");
        }
        double mucUuDai;
        try{            
            mucUuDai = Double.parseDouble(view.txtMucUuDai.getText());
        } catch (NumberFormatException ex) {
            errorList.add("Nhập sai định dạng mức ưu đãi ");
        }
        String error = String.join("\n", errorList);
        
        return error;
    }
    private void deleteLoaiKhachHang(){
        if(loaiKhachHangSelected == null){
            JOptionPane.showMessageDialog(view, "Bạn chưa chọn khách hàng muốn xóa","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa khách hàng " + loaiKhachHangSelected.getId()+ "\" không ?", "Xóa dữ liệu bàn!", JOptionPane.OK_CANCEL_OPTION);

        if(confirm == JOptionPane.CANCEL_OPTION)
            return;
        
        boolean result = loaiKhachHangService.delete(loaiKhachHangSelected.getId());
        if(result){
                JOptionPane.showMessageDialog(view, "Xóa khách hàng thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loaiKhachHangSelected = null;
        } else
            JOptionPane.showMessageDialog(view, "Xóa thất bại","Error", JOptionPane.ERROR_MESSAGE);
        resetLoaiKhachHang();
    }
}
