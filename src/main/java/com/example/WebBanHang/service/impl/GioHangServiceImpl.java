package com.example.WebBanHang.service.impl;

import com.example.WebBanHang.entities.GioHang;
import com.example.WebBanHang.entities.NguoiDung;
import com.example.WebBanHang.repository.GioHangRepository;
import com.example.WebBanHang.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GioHangServiceImpl implements GioHangService{
	
	@Autowired
	private GioHangRepository repo;
	
	@Override
	public GioHang getGioHangByNguoiDung(NguoiDung n)
	{
		return repo.findByNguoiDung(n);
	}
	
	@Override
	public GioHang save(GioHang g)
	{
		return repo.save(g);
	}

}
