package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.PokemonDomain;
import com.example.demo.dto.PokemonDto;
import com.example.demo.service.IPokemon;

@RestController
@RequestMapping("/pokemon/v1")
public class PokedexController {
	
	@Autowired
	IPokemon iPokemon;
	
	@GetMapping
	public PokemonDomain getPokemons(){
		
		PokemonDomain  pokemon = iPokemon.getPokemon();						
	
		return pokemon;
		
	}

}
