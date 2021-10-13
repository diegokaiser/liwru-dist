package app.liwru.pollux.svc.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Motivo {

    @Id
    private Integer idMotivo;
    private String estadoDescripcion;

}
