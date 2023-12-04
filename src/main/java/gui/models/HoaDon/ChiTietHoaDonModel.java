
package gui.models.HoaDon;




public class ChiTietHoaDonModel {
    private String tenMonAn;
    private int soLuong;
    private int gia;
    private int thanhTien;

    public ChiTietHoaDonModel() {
    }

    public ChiTietHoaDonModel(String tenMonAn, int soLuong, int gia, int thanhTien) {
        this.tenMonAn = tenMonAn;
        this.soLuong = soLuong;
        this.gia = gia;
        this.thanhTien = thanhTien;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
}
