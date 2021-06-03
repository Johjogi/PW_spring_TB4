package pe.edu.upc.pandemia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
