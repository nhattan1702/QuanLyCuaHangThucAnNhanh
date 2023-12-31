
package gui.models.KhachHang;

import java.util.Date;


public class KhachHangModel {
    private int id;
    private String ten;
    private String sdt;
    private int diemTichLuy;
    private String loaiKhachHang;
    private String email;
    private Date ngaySinh;
    private boolean gioiTinhNam;

    public KhachHangModel() {
    }

    public KhachHangModel(int id, String ten, String sdt, int diemTichLuy, String loaiKhachHang, String email, Date ngaySinh, boolean gioiTinhNam) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.diemTichLuy = diemTichLuy;
        this.loaiKhachHang = loaiKhachHang;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.gioiTinhNam = gioiTinhNam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
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
