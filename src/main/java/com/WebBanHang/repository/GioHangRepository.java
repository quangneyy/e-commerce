package com.WebBanHang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebBanHang.entities.GioHang;
import com.WebBanHang.entities.NguoiDung;

public interface GioHangRepository extends JpaRepository<GioHang, Long>{
	
	GioHang findByNguoiDung(NguoiDung n);
	
}
