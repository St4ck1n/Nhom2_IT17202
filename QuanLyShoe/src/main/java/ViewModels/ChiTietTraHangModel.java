/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import DomainModels.ChiTietHoaDonEntity;
import DomainModels.DoiTraHangEntity;

/**
 *
 * @author boquy
 */
public class ChiTietTraHangModel {

    private DoiTraHangEntity DoiTraHangEntity;
    private ChiTietHoaDonEntity ChiTietHoaDonEntity;
    private String TenSP;
    private String Size;
    private String Mau;
    private String TenHang;
    private String TheLoai;
    private int SoLuong;
    private float GiaTien;

    public ChiTietTraHangModel() {
    }

    public ChiTietTraHangModel(DoiTraHangEntity DoiTraHangEntity, ChiTietHoaDonEntity ChiTietHoaDonEntity, String TenSP, String Size, String Mau, String TenHang, String TheLoai, int SoLuong, float GiaTien) {
        this.DoiTraHangEntity = DoiTraHangEntity;
        this.ChiTietHoaDonEntity = ChiTietHoaDonEntity;
        this.TenSP = TenSP;
        this.Size = Size;
        this.Mau = Mau;
        this.TenHang = TenHang;
        this.TheLoai = TheLoai;
        this.SoLuong = SoLuong;
        this.GiaTien = GiaTien;
    }

    public DoiTraHangEntity getDoiTraHangEntity() {
        return DoiTraHangEntity;
    }

    public void setDoiTraHangEntity(DoiTraHangEntity DoiTraHangEntity) {
        this.DoiTraHangEntity = DoiTraHangEntity;
    }

    public ChiTietHoaDonEntity getChiTietHoaDonEntity() {
        return ChiTietHoaDonEntity;
    }

    public void setChiTietHoaDonEntity(ChiTietHoaDonEntity ChiTietHoaDonEntity) {
        this.ChiTietHoaDonEntity = ChiTietHoaDonEntity;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
        this.GiaTien = GiaTien;
    }


}
