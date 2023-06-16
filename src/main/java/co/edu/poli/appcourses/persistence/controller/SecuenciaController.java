package co.edu.poli.appcourses.persistence.controller;


import co.edu.poli.appcourses.persistence.entity.Secuencia;
import co.edu.poli.appcourses.service.SecuenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secuencia")
@RequiredArgsConstructor
public class SecuenciaController {

    private final SecuenciaService secuenciaService;

    @PostMapping
    public Secuencia save(@RequestBody Secuencia secuencia){ return secuenciaService.save(secuencia);}

    @GetMapping("getAllSecuencia")
    public List<Secuencia> findAll() {
        return secuenciaService.findAll();
    }


    @GetMapping("getSecuenciaById/{id}")
    public Secuencia finById(Long secuenciaId){
        return secuenciaService.finById(secuenciaId).get();
    }

    @DeleteMapping("deleteAllTarea")
    public void deleteAll(){
        secuenciaService.deleteAll();}

    @DeleteMapping("deleteSecuenciaById/{id}")
    public void deleteById(Long secuenciaId){
        secuenciaService.deleteById(secuenciaId);
    }


}
