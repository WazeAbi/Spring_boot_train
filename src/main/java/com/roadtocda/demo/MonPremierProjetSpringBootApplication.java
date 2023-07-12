  package com.roadtocda.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roadtocda.demo.model.helloworld;
import com.roadtocda.demo.service.Business;

@SpringBootApplication
public class MonPremierProjetSpringBootApplication implements CommandLineRunner{

	@Autowired
	private Business bs;

	public static void main(String[] args) {
		SpringApplication.run(MonPremierProjetSpringBootApplication.class, args);
	}
	public void run(String... args) throws Exception {
		helloworld hw = bs.gethelloworld();
		System.out.println(hw);
	}
	}
   