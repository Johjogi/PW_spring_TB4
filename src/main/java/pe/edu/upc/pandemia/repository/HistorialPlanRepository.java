package pe.edu.upc.pandemia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.pandemia.entities.HistorialPlan;
import pe.edu.upc.pandemia.entities.HistorialPlanID;

public interface HistorialPlanRepository extends JpaRepository<HistorialPlan, HistorialPlanID> {

}
