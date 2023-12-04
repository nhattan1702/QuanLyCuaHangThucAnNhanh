
package gui.models.NhanVien;


public class UpdateTaiKhoanNhanVienModel {
      private String ma;
      private String password;

    public UpdateTaiKhoanNhanVienModel(String ma, String password) {
        this.ma = ma;
        this.password = password;
    }
      
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      
      
}
