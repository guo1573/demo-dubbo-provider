package com.demo.provider;


import com.demo.entity.Product;
import com.demo.inter.ProductService;

public class ProductServiceImpl implements ProductService {


	@Override
	public String testStringTransfer(final String str) {
		System.out.println(str);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public Product getProduct(final Product pro) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return pro;
	}
	

}
