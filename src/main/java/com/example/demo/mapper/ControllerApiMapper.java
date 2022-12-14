package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.domain.PetDomain;
import com.example.demo.domain.PokemonDomain;
import com.example.demo.dto.PetDto;
import com.example.demo.dto.PokemonDto;

@Mapper
public interface ControllerApiMapper {
	
	PokemonDomain to (PokemonDto pokemonDto);
	
	PetDomain to (PetDto petDto);

}
