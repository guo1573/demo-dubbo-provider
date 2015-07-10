package com.demo.provider;


import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.rpc.RpcContext;
import com.demo.entity.Product;
import com.demo.inter.ProductService;

public class USProductServiceImpl extends ProductServiceImpl implements ProductService {


	
	public List<String> mergeResult() {
		List<String> menus = new ArrayList<String>();
		menus.add("group-2.1");
		menus.add("group-2.2");
		return menus;
	}
	

}
