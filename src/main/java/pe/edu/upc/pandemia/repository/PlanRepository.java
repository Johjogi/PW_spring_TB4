package pe.edu.upc.pandemia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
