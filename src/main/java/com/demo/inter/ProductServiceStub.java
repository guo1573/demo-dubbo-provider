package com.demo.inter;

import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.rpc.RpcContext;
import com.demo.entity.Product;
import com.demo.inter.ProductService;

public class ProductServiceStub implements ProductService {

	private final ProductService productService;

	public ProductServiceStub(final ProductService productService) {
		this.productService = productService;
	}

	@Override
	public String sayHello(String str) {
		System.out.println("stub return");
		return "stub return:"+str;
	}

	@Override
	public String sayHello(String str, Integer waitTime) {
		System.out.println("stub return");
		return "stub return:" + str;
	}

	@Override
	public Product getProduct(Product pros) {
		System.out.println("stub return");
		return pros;
	}

	@Override
	public String getProviderName(String str) {
		System.out.println("stub return");
		return "stub return:" + RpcContext.getContext().getLocalAddressString();
	}

	@Override
	public Date getProviderCurrentDate(String str) {
		System.out.println("stub return");
		return new Date();
	}

	@Override
	public List<String> mergeResult() {
		System.out.println("stub return");
		return null;
	}

}
