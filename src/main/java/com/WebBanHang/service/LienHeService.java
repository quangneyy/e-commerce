package com.WebBanHang.service;

import java.text.ParseException;

import org.springframework.data.domain.Page;

import com.WebBanHang.dto.SearchLienHeObject;
import com.WebBanHang.entities.LienHe;

public interface LienHeService {

	Page<LienHe> getLienHeByFilter(SearchLienHeObject object, int page) throws ParseException;

	LienHe findById(long id);
	
	LienHe save(LienHe lh);
	
	int countByTrangThai(String trangThai);

}
