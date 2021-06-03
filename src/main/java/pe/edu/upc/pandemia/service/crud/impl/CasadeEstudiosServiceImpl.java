package pe.edu.upc.pandemia.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.CasaDeEstudios;
import pe.edu.upc.pandemia.repository.CasadeEstudiosRepository;
import pe.edu.upc.pandemia.service.crud.CasadeEstudiosService;

public class CasadeEstudiosServiceImpl implements CasadeEstudiosService {

	@Autowired
	private CasadeEstudiosRepository casadeEstudiosRepository;
	
	@Override
	public JpaRepository<CasaDeEstudios, Integer> getRepository() {
		return casadeEstudiosRepository;
	}

}
