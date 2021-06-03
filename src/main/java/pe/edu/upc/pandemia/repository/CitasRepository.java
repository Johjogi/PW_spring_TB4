package pe.edu.upc.pandemia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Citas;

public interface CitasRepository extends JpaRepository<Citas, Integer> {

}
