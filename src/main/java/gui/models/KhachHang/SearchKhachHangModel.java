
package gui.models.KhachHang;


public class SearchKhachHangModel {
    private String idOrName;
    private int gioiTinh;
    private int idLoaiKhachHang;
    private String sdt;

    public SearchKhachHangModel() {
    }

    public SearchKhachHangModel(String idOrName, int gioiTinh, int idLoaiKhachHang, String sdt) {
        this.idOrName = idOrName;
        this.gioiTinh = gioiTinh;
        this.idLoaiKhachHang = idLoaiKhachHang;
        this.sdt = sdt;
    }

    public String getIdOrName() {
        return idOrName;
    }

    public void setIdOrName(String idOrName) {
        this.idOrName = idOrName;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getIdLoaiKhachHang() {
        return idLoaiKhachHang;
    }

    public void setIdLoaiKhachHang(int idLoaiKhachHang) {
        this.idLoaiKhachHang = idLoaiKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
