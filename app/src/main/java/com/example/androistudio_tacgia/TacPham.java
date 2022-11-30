package com.example.androistudio_tacgia;

import java.io.Serializable;

public class TacPham implements Serializable {
    String nameTacPham;
    int imgTacPham;
    String thongTin;

    public TacPham(String nameTacPham, int imgTacPham, String thongTin) {
        this.nameTacPham = nameTacPham;
        this.imgTacPham = imgTacPham;
        this.thongTin = thongTin;
    }

    public String getNameTacPham() {
        return nameTacPham;
    }

    public void setNameTacPham(String nameTacPham) {
        this.nameTacPham = nameTacPham;
    }

    public int getImgTacPham() {
        return imgTacPham;
    }

    public void setImgTacPham(int imgTacPham) {
        this.imgTacPham = imgTacPham;
    }

    public String getThongTinTP() {
        return thongTin;
    }

    public void setThongTinTP(String thongTin) {
        this.thongTin = thongTin;
    }
}
