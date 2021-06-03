package pe.edu.upc.pandemia.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Curriculum;
import pe.edu.upc.pandemia.entities.CurriculumId;
import pe.edu.upc.pandemia.repository.CurriculumRepository;
import pe.edu.upc.pandemia.service.crud.CurriculumService;

public class CurriculumServiceImpl implements CurriculumService {
	@Autowired
	private CurriculumRepository curriculumRepository; 
	@Override
	public JpaRepository<Curriculum, CurriculumId> getRepository() {
		return curriculumRepository;
	}

}
