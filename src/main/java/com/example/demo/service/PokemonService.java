package com.example.demo.service;


import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.consumer.PokemonConsumer;
import com.example.demo.domain.PokemonDomain;
import com.example.demo.dto.PokemonDto;
import com.example.demo.mapper.PokemonMapper;

@Service
public class PokemonService implements IPokemon {
	
	@Autowired
	PokemonConsumer pokemonConsumer;
	
	private PokemonMapper pokemonMapper = Mappers.getMapper(PokemonMapper.class);

	@Override
	public PokemonDomain getPokemon() {
		
		PokemonDomain var = pokemonMapper.to(pokemonConsumer.getPokemon());
		return var;
	}

}
