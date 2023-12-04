
package gui.models.LoaiKhachHang;




public class CreateLoaiKhachHangModel {
    private String ten;
    private int diemToiThieu;
    private float mucUuDai;

    public CreateLoaiKhachHangModel() {
    }

    public CreateLoaiKhachHangModel(String ten, int diemToiThieu, float mucUuDai) {
        this.ten = ten;
        this.diemToiThieu = diemToiThieu;
        this.mucUuDai = mucUuDai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDiemToiThieu() {
        return diemToiThieu;
    }

    public void setDiemToiThieu(int diemToiThieu) {
        this.diemToiThieu = diemToiThieu;
    }

    public float getMucUuDai() {
        return mucUuDai;
    }

    public void setMucUuDai(float mucUuDai) {
        this.mucUuDai = mucUuDai;
    }
    
}
