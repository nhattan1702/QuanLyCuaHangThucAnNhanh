
package gui.models.KhachHang;

import java.util.Date;


public class CreateKhachHangModel {
    private String ten;
    private String sdt;
    private String email;
    private Date ngaySinh;
    private boolean gioiTinhNam;

    public CreateKhachHangModel() {
    }

    public CreateKhachHangModel(String ten, String sdt, String email, Date ngaySinh, boolean gioiTinhNam) {
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.gioiTinhNam = gioiTinhNam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinhNam() {
        return gioiTinhNam;
    }

    public void setGioiTinhNam(boolean gioiTinhNam) {
        this.gioiTinhNam = gioiTinhNam;
    }

    
}
