package cristian.net.pruebatecnica.controller;

import cristian.net.pruebatecnica.modelo.Curso;
import cristian.net.pruebatecnica.modelo.Descuentos;
import cristian.net.pruebatecnica.repository.Cursorepositorio;
import cristian.net.pruebatecnica.repository.Descuentorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/descuentos")
public class DescuentosControlador {

    @Autowired
    private Descuentorepositorio descuentorepositorio;
    //Traer todos los cursos
    @GetMapping
    public List<Descuentos> getALLDescuentos()
    {
        return descuentorepositorio.findAll();
    }

    //Crear Curso
    @PostMapping
    public Descuentos createDescuentos(@RequestBody Descuentos descuentos)
    {
        long modalidad = descuentos.getModalidad().getIdmodalidad();
        if(modalidad == 1l)
        {
            descuentos.setDescuento((descuentos.getDescuento()*10)/100);
        }else if (modalidad == 2l)
        {
            descuentos.setDescuento((descuentos.getDescuento()*20)/100);
        }
        else {
            descuentos.setDescuento((descuentos.getDescuento()*30)/100);
        }
        return descuentorepositorio.save(descuentos);
    }

}
