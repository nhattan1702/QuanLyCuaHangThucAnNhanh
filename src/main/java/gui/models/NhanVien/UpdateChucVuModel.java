
package gui.models.NhanVien;


public class UpdateChucVuModel {
    private int id;
    private String ten;

    public UpdateChucVuModel(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }
    
    public UpdateChucVuModel()
    {
        
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
}
