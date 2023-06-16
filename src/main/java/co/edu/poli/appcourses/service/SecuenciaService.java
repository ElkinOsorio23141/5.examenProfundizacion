package co.edu.poli.appcourses.service;

import co.edu.poli.appcourses.persistence.entity.Secuencia;

import java.util.List;
import java.util.Optional;

public interface SecuenciaService {

    Secuencia save(Secuencia secuencia);
    List<Secuencia> findAll();
    Optional<Secuencia> finById(Long secuenciaId);
    void deleteAll();
    void deleteById(Long secuenciaId);
}
