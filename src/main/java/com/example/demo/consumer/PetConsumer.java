package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.PetDto;

@FeignClient(name = "USER-MOCK-API-PET", url = "${external.mock.api.pets}")
public interface PetConsumer {
	
	  @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	  PetDto getPets ();

}
