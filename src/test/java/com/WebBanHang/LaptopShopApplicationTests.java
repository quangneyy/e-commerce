package com.WebBanHang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.WebBanHang.repository.DonHangRepository;
import com.WebBanHang.repository.NguoiDungRepository;
import com.WebBanHang.service.DanhMucService;
import com.WebBanHang.service.NguoiDungService;
import com.WebBanHang.service.SanPhamService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LaptopShopApplicationTests {

	@Autowired
	private DanhMucService dmService;

	@Autowired
	private NguoiDungService nguoiDungService;

	@Autowired
	private NguoiDungRepository ndRepo;

	@Autowired
	private DonHangRepository dhRepo;
	
	@Autowired
	private SanPhamService spService;


//	@Test
//	public void getALlDanhMucTest() {
//		System.out.println(dhRepo.test().size());
//	}

	@Test
	public void getALlDanhMucTest() {
		System.out.println(spService.getSanPhamByTenSanPhamForAdmin("asus",0,10).getContent().size());
	}

}
