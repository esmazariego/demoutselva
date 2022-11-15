package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.PokemonDto;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}")
public interface PokemonConsumer {
	
	  @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	  PokemonDto getPokemon ();

}
