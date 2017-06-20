package com.crm.manufracturer.service;

import com.crm.manufracturer.domain.Manufracturer;

public interface ManufracturerService {
	
	public int createManufracturer(Manufracturer manufracturer);
	
	public Manufracturer getManufracturer(int manufracturerNumber);
	
	public int updateManufracturer(Manufracturer manufracturer);
	
	public void deleteManufracturer(int manufracturerNumber);

}
