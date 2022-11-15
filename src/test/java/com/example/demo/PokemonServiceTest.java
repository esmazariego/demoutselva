package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.consumer.PokemonConsumer;
import com.example.demo.domain.PokemonDomain;
import com.example.demo.dto.PokemonDto;
import com.example.demo.service.PokemonService;

@SpringBootTest
@ActiveProfiles("test")
public class PokemonServiceTest {

	
	@Autowired
	PokemonService service;
	
	@MockBean
	PokemonConsumer consumer;
	
	
	@Test
	public void wheConsumerCallResponseOk(){
		
		when(consumer.getPokemon()).thenReturn(getPokemonMock());
		
		PokemonDomain response = service.getPokemon();
		
		assertNotNull(response);
		assertEquals("PIKACHU", response.getName());
		
	}

	@Test
	public void wheConsumerCallResponseError(){
		
		assertThrows(Exception.class, () -> service.getPokemon());
		
	}

	private PokemonDto getPokemonMock() {
		PokemonDto pokemon = new PokemonDto();
		
		pokemon.setHeight("12");
		pokemon.setName("PIKACHU");
		pokemon.setWeight("12");
		
		return pokemon;
	}
	
}
