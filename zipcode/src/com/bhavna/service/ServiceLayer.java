package com.bhavna.service;

import com.bhavna.model.ZipServicev1;
import com.bhavna.model.ZipServicev2;

public class ServiceLayer {
	public ServiceLayer() {
		
	}
	public ZipServicev1 getObject() {
		return new ZipServicev2();
	}

}
