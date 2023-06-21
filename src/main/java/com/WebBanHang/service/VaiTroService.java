package com.WebBanHang.service;

import java.util.List;

import com.WebBanHang.entities.VaiTro;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);
	List<VaiTro> findAllVaiTro();
}
