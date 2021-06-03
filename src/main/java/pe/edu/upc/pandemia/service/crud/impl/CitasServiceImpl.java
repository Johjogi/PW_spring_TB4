package pe.edu.upc.pandemia.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Citas;
import pe.edu.upc.pandemia.repository.CitasRepository;
import pe.edu.upc.pandemia.service.crud.CitasService;

public class CitasServiceImpl implements CitasService {

	@Autowired
	private CitasRepository citasRepository;
	@Override
	public JpaRepository<Citas, Integer> getRepository() {
		return citasRepository;
	}

}
