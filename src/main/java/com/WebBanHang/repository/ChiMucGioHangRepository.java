package com.WebBanHang.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebBanHang.entities.ChiMucGioHang;
import com.WebBanHang.entities.GioHang;
import com.WebBanHang.entities.SanPham;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long>{
	
	ChiMucGioHang findBySanPhamAndGioHang(SanPham sp,GioHang g);
	
	List<ChiMucGioHang> findByGioHang(GioHang g);
}
