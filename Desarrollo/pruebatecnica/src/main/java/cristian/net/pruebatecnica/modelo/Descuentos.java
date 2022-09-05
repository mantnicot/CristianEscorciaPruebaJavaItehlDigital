package cristian.net.pruebatecnica.modelo;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="descuentos")
public class Descuentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddescuento;
    @Column(name = "nombre")
    private String nombre;
    @ManyToOne(optional = false)
    @JoinColumn(name = "modalidad")
    private Modalidad modalidad;
    @Column(name = "pais")
    private String pais;
    @Column(name = "descuento")
    private float descuento;
    @ManyToOne(optional = false)
    @JoinColumn(name = "curso")
    private Curso curso;
    @Column(name = "fecha_final")
    private Date fecha_final;
}
