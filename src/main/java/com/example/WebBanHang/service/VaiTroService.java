package com.example.WebBanHang.service;

import com.example.WebBanHang.entities.VaiTro;

import java.util.List;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);
	List<VaiTro> findAllVaiTro();
}
