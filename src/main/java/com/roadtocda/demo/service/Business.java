package com.roadtocda.demo.service;

import org.springframework.stereotype.Component;

import com.roadtocda.demo.model.helloworld;
@Component
public class Business {
	public helloworld gethelloworld() 
	{
		helloworld hw = new helloworld();
		return hw;
	}
	;

}
