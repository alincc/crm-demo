package com.crm.manufracturer.repository;

import org.springframework.stereotype.Repository;

import com.crm.manufracturer.domain.Manufracturer;

@Repository
public class ManufracturerRepository {
	
	public ManufracturerRepository(){}
	
	public Manufracturer getManufracturer(int manufracturerNumber){
		
		Manufracturer manufracturer = new Manufracturer();
		manufracturer.setManufracturerNumber(1001);
		manufracturer.setName("XYZ");
		
		return manufracturer;
	}
	
}
