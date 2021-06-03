package pe.edu.upc.pandemia.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Horario;
import pe.edu.upc.pandemia.repository.HorarioRepository;
import pe.edu.upc.pandemia.service.crud.HorarioService;

public class HorarioServiceImpl implements HorarioService {
	@Autowired
	private HorarioRepository horarioRepository;
	@Override
	public JpaRepository<Horario, Integer> getRepository() {
		return horarioRepository;
	}

}
