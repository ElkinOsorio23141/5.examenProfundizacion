package co.edu.poli.appcourses.persistence.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "secuencia")
public class Secuencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "secuencia_id")
    private Long secuenciaId;
    @ElementCollection
    private List<String> muestra;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Secuencia secuencia)) return false;

        return secuenciaId.equals(secuencia.secuenciaId);
    }

    @Override
    public int hashCode() {
        return secuenciaId.hashCode();
    }
}
