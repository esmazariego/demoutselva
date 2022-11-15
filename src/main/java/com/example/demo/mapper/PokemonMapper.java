package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.domain.PokemonDomain;
import com.example.demo.dto.PokemonDto;

@Mapper
public interface PokemonMapper {
	
	PokemonDomain to (PokemonDto pokemonDto);

}
