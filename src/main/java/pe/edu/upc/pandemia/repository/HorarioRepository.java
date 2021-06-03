package pe.edu.upc.pandemia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {
	
}
