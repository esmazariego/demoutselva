package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.PetDomain;
import com.example.demo.domain.PokemonDomain;
import com.example.demo.service.IControllerApis;

@RestController
@RequestMapping("/apiDemo/v1")
public class ControllerApis {
	
	@Autowired
	IControllerApis iControllerApis;
	
	@GetMapping(value="/pokemon")
	public PokemonDomain getPokemonPikachu(@RequestParam String namePokemon){
		
		PokemonDomain  pokemon = iControllerApis.getPokemon(namePokemon);						
	
		return pokemon;
		
	}
	
	
	@GetMapping(value="/mascotas")
	public PetDomain getPets(){
		
		PetDomain  pets = iControllerApis.getPet();						
	
		return pets;
		
	}
	
}
