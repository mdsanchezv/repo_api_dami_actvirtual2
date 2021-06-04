package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Formulario;
import com.cibertec.service.FormularioService;

@RestController
@RequestMapping("/rest/formulario")
public class FormularioController {

	@Autowired
	private FormularioService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Formulario>> listaFormulario(){
		List<Formulario> lista = service.listaFormulario();
		return ResponseEntity.ok(lista);
	}
}
