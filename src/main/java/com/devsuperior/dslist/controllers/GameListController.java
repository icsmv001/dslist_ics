package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController 

@RequestMapping(value ="/lists")
public class GameListController {

	@Autowired 
	private GameListService gameListService;
	
//	//criando o metodo de buscar games por id 
//	@GetMapping("{id}")
//	public GameListDTO findById(@PathVariable  Long id){
//		GameListDTO result = gameListService.findById(id);
//		return result;
//	}
	

	
	//criando o metodo de buscar lista de games 
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	
	
	
	
}
