package com.demo.provider;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.alibaba.dubbo.rpc.RpcContext;
import com.demo.entity.Product;
import com.demo.inter.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public String sayHello(final String str) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" request::"+str);
		return str;
	}

	private AtomicInteger count = new AtomicInteger(0);;

	@Override
	public String sayHello(String str, Integer waitTime) {
		System.out.println(count.addAndGet(1) +":" + str);
		try {
			if (waitTime != 0) {
				Thread.sleep(waitTime);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public Product getProduct(final Product pro) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(pro.getProId());
		return pro;
	}

	@Override
	public String getProviderName(final String str) {
		return RpcContext.getContext().getLocalAddressString();
	}
	
	
	@Override
	public Date getProviderCurrentDate(String str){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
		return new Date();
	}

	public List<String> mergeResult() {
		List<String> menus = new ArrayList<String>();
		menus.add("group-1.1");
		menus.add("group-1.2");
		return menus;
	}

}
