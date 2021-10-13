package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provincia {

    @Id
    private Integer idProvincia;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdDepartamento", nullable = false, updatable = false)
    @JsonIgnoreProperties("IdDepartamento")
    private Departamento departamento;
}
