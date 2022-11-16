package com.example.demo.service;


import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.consumer.PetConsumer;
import com.example.demo.consumer.PokemonConsumer;
import com.example.demo.domain.PetDomain;
import com.example.demo.domain.PokemonDomain;
import com.example.demo.dto.PokemonDto;
import com.example.demo.mapper.ControllerApiMapper;

@Service
public class ControllerApiService implements IControllerApis {
	
	@Autowired
	PokemonConsumer pokemonConsumer;
	
	@Autowired
	PetConsumer petConsumer;
	
	private ControllerApiMapper mapper = Mappers.getMapper(ControllerApiMapper.class);

	@Override
	public PokemonDomain getPokemon(String namePokemon) {
		
		PokemonDomain var = mapper.to(pokemonConsumer.getPokemon());
		
		return var;
	}

	@Override
	public PetDomain getPet() {
		
		return mapper.to(petConsumer.getPets());
	}

}
