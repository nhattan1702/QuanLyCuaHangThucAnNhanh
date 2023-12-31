package gui.models.DonGoi;



public class UpdateDonGoiModel {
    private int idBan;
    private int idMA;
    private int soLuong;
    private String ghiChu;

    public UpdateDonGoiModel() {
    }

    public UpdateDonGoiModel(int idBan, int idMA,  int soLuong, String ghiChu) {
        this.idBan = idBan;
        this.idMA = idMA;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public int getIdMA() {
        return idMA;
    }

    public void setIdMA(int idMA) {
        this.idMA = idMA;
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
}
