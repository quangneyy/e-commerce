package com.example.WebBanHang.service;

import com.example.WebBanHang.entities.GioHang;
import com.example.WebBanHang.entities.NguoiDung;

public interface GioHangService {
	
	GioHang getGioHangByNguoiDung(NguoiDung n);
	
	GioHang save(GioHang g);
}
