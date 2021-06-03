package pe.edu.upc.pandemia.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Especialidad;
import pe.edu.upc.pandemia.repository.EspecialidadRepository;
import pe.edu.upc.pandemia.service.crud.EspecialidadService;

public class EspecialidadServiceImpl implements EspecialidadService {
	@Autowired
	private EspecialidadRepository especialidadRepository;
	@Override
	public JpaRepository<Especialidad, Integer> getRepository() {
		return especialidadRepository;
	}

}
