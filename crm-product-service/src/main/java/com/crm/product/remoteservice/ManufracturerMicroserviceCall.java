package com.crm.product.remoteservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.product.domain.Manufracturer;

@FeignClient(name="crm-manufracture-service")
public interface ManufracturerMicroserviceCall {
	
	@RequestMapping(method=RequestMethod.GET, value="/manufracture/{manufractureId}")
	public Manufracturer getManufracturer(@PathVariable("manufractureId") int manufractureId);

}
