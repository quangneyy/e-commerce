package com.example.WebBanHang.service.impl;

import com.example.WebBanHang.entities.ChiTietDonHang;
import com.example.WebBanHang.repository.ChiTietDonHangRepository;
import com.example.WebBanHang.service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService{
	
	@Autowired
	private ChiTietDonHangRepository repo;
	
	@Override
	public List<ChiTietDonHang> save(List<ChiTietDonHang> list)
	{	
		return repo.saveAll(list);
	}
}
