package com.WebBanHang.service;

import com.WebBanHang.entities.GioHang;
import com.WebBanHang.entities.NguoiDung;

public interface GioHangService {
	
	GioHang getGioHangByNguoiDung(NguoiDung n);
	
	GioHang save(GioHang g);
}
