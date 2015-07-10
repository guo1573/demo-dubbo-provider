package com.demo.inter;

import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.rpc.RpcContext;
import com.demo.entity.Product;
import com.demo.inter.ProductService;

/**
 * 
 * @desc 本类功能都在consumer实现，但是本类不能移除，否则报错 
 *
 */
public class ProductServiceMock implements ProductService{

	
	public ProductServiceMock(){
	}
	
	@Override
	public String sayHello(String str) {
		System.out.println("mock return");
		return "服务器异常，返回本地容错数据";
	}

	@Override
	public String sayHello(String str, Integer waitTime) {
		System.out.println("mock return");
		return "mock return:"+str;
	}

	@Override
	public Product getProduct(Product pros) {
		System.out.println("mock return");
		return pros;
	}

	@Override
	public String getProviderName(String str) {
		System.out.println("mock return");
		return "mock return:"+RpcContext.getContext().getLocalAddressString();
	}

	@Override
	public Date getProviderCurrentDate(String str) {
		System.out.println("mock return");
		return new Date();
	}

	@Override
	public List<String> mergeResult() {
		System.out.println("mock return");
		return null;
	}

}
