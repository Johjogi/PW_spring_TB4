package pe.edu.upc.pandemia.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.GradoAcademico;
import pe.edu.upc.pandemia.repository.GradoAcademicoRepository;
import pe.edu.upc.pandemia.service.crud.GradoAcademicoService;

public class GradoAcademicoServiceImpl implements GradoAcademicoService {
	@Autowired
	private GradoAcademicoRepository gradoAcademicoRepository;
	@Override
	public JpaRepository<GradoAcademico, Integer> getRepository() {
		return gradoAcademicoRepository;
	}

}
