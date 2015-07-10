package com.demo.provider;

import com.demo.inter.BaseService;

public class BaseServiceImpl implements BaseService {

	@Override
	public String sayHello(String say) {
		System.out.println(say);
		return say;
	}

}
