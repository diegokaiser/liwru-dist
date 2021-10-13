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
public class Incidencia {

    @Id
    private Integer idIncidencia;
    private String codigoIncidencia;
    private LocalDate fechaIncidencia;
    private Integer tipoAtencion;
    /*private Integer idMotivo;
    private Integer idTipoDoc;
    private Integer idEstado;
    private Integer idSede;
    private Integer idAgraviado;
    private Integer idUsuario;
    private Integer tipoAtencion;
    private String fechaAproximada;
    private Integer existeDocs;
    private String fileDocs;
    private String pedidoIncidencia;
    private String detalleIncidencia;*/
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;


    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false, updatable = false)
    @JsonIgnoreProperties("idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idTipoIncidencia", nullable = false, updatable = false)
    @JsonIgnoreProperties("idTipoIncidencia")
    private TipoIncidencia tipoIncidencia;


    @ManyToOne
    @JoinColumn(name = "idMotivo", nullable = false, updatable = false)
    @JsonIgnoreProperties("idMotivo")
    private Motivo motivo;

    @ManyToOne
    @JoinColumn(name = "idEstado", nullable = false, updatable = false)
    @JsonIgnoreProperties("idEstado")
    private Estado estado;


    @ManyToOne
    @JoinColumn(name = "idAgraviado", nullable = false, updatable = false)
    @JsonIgnoreProperties("idAgraviado")
    private Agraviado agraviado;

    @ManyToOne
    @JoinColumn(name = "idSede", nullable = false, updatable = false)
    @JsonIgnoreProperties("idSede")
    private Sede sede;

}
