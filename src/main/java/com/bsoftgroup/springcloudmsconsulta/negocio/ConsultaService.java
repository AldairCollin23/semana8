package com.bsoftgroup.springcloudmsconsulta.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsoftgroup.springcloudmsconsulta.core.interfaces.ConsultaDaoInterface;
import com.bsoftgroup.springcloudmsconsulta.core.interfaces.ConsultaServiceInterface;

@Service

public class ConsultaService implements ConsultaServiceInterface{
	@Autowired
	private ConsultaDaoInterface consultaDao;
	public ConsultaService() {}
}

