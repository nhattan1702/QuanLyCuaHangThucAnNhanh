
package gui.models.NhanVien;


public class SearchNhanVienModel {
     private String maOrhoTen;
    private int gioiTinh;
    private int chucVu;
    private int[] tinhTrang;

    public SearchNhanVienModel() {
    }

    public SearchNhanVienModel(String maOrhoTen, int gioiTinh, int chucVu, int[] tinhTrang) {
        this.maOrhoTen = maOrhoTen;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.tinhTrang = tinhTrang;
    }

    public String getMaOrhoTen() {
        return maOrhoTen;
    }

    public void setMaOrhoTen(String maOrhoTen) {
        this.maOrhoTen = maOrhoTen;
    }

    public int isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public int[] getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int[] tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
