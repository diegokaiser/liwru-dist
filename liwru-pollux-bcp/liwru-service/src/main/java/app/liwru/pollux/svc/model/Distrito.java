package app.liwru.pollux.svc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Distrito {

    @Id
    private Integer idDistrito;
    private String nombre;
    private Integer idProvincia;

    @ManyToOne
    @JoinColumn(name = "idProvincia", referencedColumnName = "idProvincia", insertable = false, updatable = false)
    @JsonIgnoreProperties("idProvincia" )
    private Provincia provincia;

}
