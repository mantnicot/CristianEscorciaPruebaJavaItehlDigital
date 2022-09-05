package cristian.net.pruebatecnica.controller;

import cristian.net.pruebatecnica.modelo.Curso;
import cristian.net.pruebatecnica.modelo.Modalidad;
import cristian.net.pruebatecnica.repository.Cursorepositorio;
import cristian.net.pruebatecnica.repository.Descuentorepositorio;
import cristian.net.pruebatecnica.repository.Modalidadrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/modalidad")
public class ModalidadControlador {

    @Autowired
    private Modalidadrepositorio modalidadrepositorio;
    @GetMapping
    public List<Modalidad> getALLmodalidad()
    {
        return modalidadrepositorio.findAll();
    }
}
