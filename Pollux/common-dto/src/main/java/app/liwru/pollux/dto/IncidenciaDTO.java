package app.liwru.pollux.dto;
import lombok.*;

import java.time.LocalDate;


@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IncidenciaDTO {
    private Integer idIncidencia;
    private String codigoIncidencia;
    private LocalDate fechaIncidencia;
    private Integer tipoAtencion;


    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;

    private UsuarioDTO usuario;
    private TipoIncidenciaDTO tipoIncidencia;
    private MotivoDTO motivo;
    private EstadoDTO estado;
    private AgraviadoDTO agraviado;
    private SedeDTO sede;



}
