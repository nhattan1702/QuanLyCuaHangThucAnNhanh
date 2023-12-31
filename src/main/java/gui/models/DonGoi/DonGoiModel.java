package gui.models.DonGoi;

import gui.models.MonAn.MonAnModel;


public class DonGoiModel {
    private int idBan;
    private MonAnModel monAn;
    private int gia;
    private int soLuong;
    private String ghiChu;
    private int thanhTien;

    public DonGoiModel() {
    }

    public DonGoiModel(int idBan, MonAnModel monAn, int gia, int soLuong, String ghiChu, int thanhTien) {
        this.idBan = idBan;
        this.monAn = monAn;
        this.gia = gia;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
        this.thanhTien = thanhTien;
    }

    public MonAnModel getMonAn() {
        return monAn;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public void setMonAn(MonAnModel monAn) {
        this.monAn = monAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
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
