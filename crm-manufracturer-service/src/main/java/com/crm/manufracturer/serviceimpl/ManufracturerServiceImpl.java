package com.crm.manufracturer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.manufracturer.domain.Manufracturer;
import com.crm.manufracturer.repository.ManufracturerRepository;
import com.crm.manufracturer.service.ManufracturerService;

@Service
public class ManufracturerServiceImpl implements ManufracturerService {
	
	@Autowired
	private ManufracturerRepository repo;

	@Override
	public int createManufracturer(Manufracturer manufracturer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Manufracturer getManufracturer(int manufracturerNumber) {
		
		Manufracturer manufracturer = repo.getManufracturer(manufracturerNumber);
		return manufracturer;
	}

	@Override
	public int updateManufracturer(Manufracturer manufracturer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteManufracturer(int manufracturerNumber) {
		// TODO Auto-generated method stub
		
	}

}
