package co.edu.poli.appcourses.persistence.repository;

import co.edu.poli.appcourses.persistence.entity.Secuencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecuenciaRepository extends JpaRepository<Secuencia, Long> {
}
