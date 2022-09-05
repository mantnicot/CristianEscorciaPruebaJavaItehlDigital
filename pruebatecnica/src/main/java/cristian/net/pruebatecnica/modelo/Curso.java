package cristian.net.pruebatecnica.modelo;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcurso;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "costo")
    private int costo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "horas")
    private int horas;
    @Column(name = "dirigido")
    private String dirigido;
    @ManyToOne(optional = false)
    @JoinColumn(name = "modalidad")
    private Modalidad modalidad;
}
