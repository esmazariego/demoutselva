package com.example.demo.service;

import com.example.demo.domain.PetDomain;
import com.example.demo.domain.PokemonDomain;

public interface IControllerApis {
	
	
	public PokemonDomain getPokemon(String namePokemon);
	
	public PetDomain getPet();

}
