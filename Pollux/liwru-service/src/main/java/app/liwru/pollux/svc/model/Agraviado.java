package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agraviado {

    @Id
    private Integer idAgraviado;
    private String clienteNombre;
    private String clienteApeMat;
    private String clienteApePat;
    private String clienteEmail;
    private String clienteTelefono;
    private String clienteDireccion;
    private String clienteNroDoc;
    private Integer estatusEdad;
    private Integer estado;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @ManyToOne
    @JoinColumn(name = "idDistrito", nullable = false, updatable = false)
    @JsonIgnoreProperties("idDistrito")
    private Distrito distrito;


}
