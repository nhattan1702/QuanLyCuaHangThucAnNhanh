
package com.mycompany.quanlynhahang;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gui.controllers.DangNhapController;
import javax.swing.UIManager;



public class QuanLyNhaHang {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch(Exception ex){
            System.out.println(ex);
        }
        DangNhapController dangNhapController = new DangNhapController();
    }
}
