package com.example.androistudio_tacgia;

import java.io.Serializable;

public class TacGia implements Serializable {
    String nameTacGia;
    int imgTacGia;
    String tacPham;
    String thongTin;

    public TacGia(String nameTacGia, int imgTacGia, String tacPham, String thongTin) {
        this.nameTacGia = nameTacGia;
        this.imgTacGia = imgTacGia;
        this.tacPham = tacPham;
        this.thongTin = thongTin;
    }

    public TacGia(String tacPham) {
        this.tacPham = tacPham;
    }

    public String getNameTacGia() {
        return nameTacGia;
    }

    public void setNameTacGia(String nameTacGia) {
        this.nameTacGia = nameTacGia;
    }

    public int getImgTacGia() {
        return imgTacGia;
    }

    public void setImgTacGia(int imgTacGia) {
        this.imgTacGia = imgTacGia;
    }

    public String gettacPham() {
        return tacPham;
    }

    public void settacPham(String tacPham) {
        this.tacPham = tacPham;
    }

    public String getthongTin() {
        return thongTin;
    }

    public void setthongTin(String thongTin) {
        this.thongTin = thongTin;
    }
}
