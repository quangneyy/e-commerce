package com.WebBanHang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebBanHang.entities.VaiTro;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

	VaiTro findByTenVaiTro(String tenVaiTro);
}
