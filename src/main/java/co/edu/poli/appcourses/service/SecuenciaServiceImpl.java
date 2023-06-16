package co.edu.poli.appcourses.service;

import co.edu.poli.appcourses.persistence.entity.Secuencia;
import co.edu.poli.appcourses.persistence.repository.SecuenciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SecuenciaServiceImpl implements SecuenciaService {

    private  final SecuenciaRepository secuenciaRepository;

    @Override
    public Secuencia save(Secuencia secuencia) {


        //Declaracion de variables
        String Muestra = "";
        String adn, adn1 = "";
        int contador = 0;
        char[] Letra = new char[5];
        char [][] matris = new char[5][5];

        //Ciclo para obtener la cadena de caracteres
        for (int i = 0; i < secuencia.getMuestra().size();i++){
            Muestra = secuencia.getMuestra().get(i);
            //Ciclo para insertar en la matris las letras
             for(int x = 0; x < Muestra.length(); x++){
                 Letra[x] = Muestra.charAt(x);
                 matris[i][x] = Letra[x];
                 System.out.println(matris[x][i]);
             }
        }

        //recorrer matris verticalmente

        for(int i = 0; i < matris.length; i++){
            int index = 0;
            for(int j = 1; j < matris.length; j++){
                adn = String.valueOf(matris[i][index]);
                adn1 = String.valueOf(matris[i][j]);
                if(adn.equals(adn1)){
                    contador = contador+1;
                    if(contador == 2){
                        System.out.println("Pacientes con Leucemia");
                        break;
                }
                index = index +1;
            }
        }
            System.out.println("Paciente sin Leucemia");
        }


        return secuenciaRepository.save(secuencia);
    }


    @Override
    public List<Secuencia> findAll() {
        return secuenciaRepository.findAll();
    }

    @Override
    public Optional<Secuencia> finById (Long secuenciaId){
        return secuenciaRepository.findById(secuenciaId);
    }

    @Override
    public void deleteAll(){
        secuenciaRepository.deleteAll();
    }

    @Override
    public void deleteById(Long secuenciaId){
        secuenciaRepository.deleteById(secuenciaId);
    }
}
