package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Formulario;

public interface FormularioService {
	public abstract List<Formulario> listaFormulario();
	public abstract Formulario insertaActualizaFormulario(Formulario obj);
}
