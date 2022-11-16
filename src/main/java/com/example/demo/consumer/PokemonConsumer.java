package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.PokemonDto;

import feign.Param;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}")
public interface PokemonConsumer {
	
	  @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	  PokemonDto getPokemon ();

}
