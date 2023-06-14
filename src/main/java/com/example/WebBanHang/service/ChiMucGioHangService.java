package com.example.WebBanHang.service;

import com.example.WebBanHang.entities.ChiMucGioHang;
import com.example.WebBanHang.entities.GioHang;
import com.example.WebBanHang.entities.SanPham;

import java.util.List;

public interface ChiMucGioHangService{
	
	List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g);
	
	ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp,GioHang g);
	
	ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c);
	
	void deleteChiMucGiohang(ChiMucGioHang c);
	
	void deleteAllChiMucGiohang(List<ChiMucGioHang> c);
	
}
