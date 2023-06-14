package com.example.WebBanHang.repository;

import com.example.WebBanHang.entities.GioHang;
import com.example.WebBanHang.entities.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GioHangRepository extends JpaRepository<GioHang, Long>{
	
	GioHang findByNguoiDung(NguoiDung n);
	
}
