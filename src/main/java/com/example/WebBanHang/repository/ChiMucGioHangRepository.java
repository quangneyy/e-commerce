package com.example.WebBanHang.repository;

import com.example.WebBanHang.entities.ChiMucGioHang;
import com.example.WebBanHang.entities.GioHang;
import com.example.WebBanHang.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long>{
	
	ChiMucGioHang findBySanPhamAndGioHang(SanPham sp,GioHang g);
	
	List<ChiMucGioHang> findByGioHang(GioHang g);
}
