package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Formulario;
import com.cibertec.repository.FormularioRepository;

@Service
public class FormularioServiceImpl implements FormularioService{

	@Autowired
	private FormularioRepository repository;
	
	@Override
	public List<Formulario> listaFormulario() {
		return repository.findAll();
	}

	@Override
	public Formulario insertaActualizaFormulario(Formulario obj) {
		return repository.save(obj);
	}

}
