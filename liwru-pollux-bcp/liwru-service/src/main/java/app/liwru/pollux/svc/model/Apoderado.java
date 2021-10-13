package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apoderado {

    @Id
    private Integer idApoderado;
    private String apoderadoNombre;
    private String apoderadoApellidoPat;
    private String apoderadoApellidoMat;
    private String apoderadoTelefono;
    private String apoderadoEmail;
    private String apoderadoNroDoc;
    private LocalDate createdAt;
    private LocalDate updatedAt;


    @ManyToOne
    @JoinColumn(name = "idTipoDoc", nullable = false, updatable = false)
    @JsonIgnoreProperties("idTipoDoc")
    private TipoDocumento tipoDocumento;
}
