package cristian.net.pruebatecnica.controller;

import cristian.net.pruebatecnica.exception.ResourceNotFoundException;
import cristian.net.pruebatecnica.modelo.Curso;
import cristian.net.pruebatecnica.repository.Cursorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/cursos")
public class CursoControlador {
    @Autowired
    private Cursorepositorio cursorepositorio;
    //Traer todos los cursos
    @GetMapping
    public List<Curso> getALLCursos()
    {
        return cursorepositorio.findAll();
    }

    //Crear Curso
    @PostMapping
    public Curso createCurso(@RequestBody Curso curso)
    {

        return cursorepositorio.save(curso);
    }
    //Obtener curso por id
    @GetMapping("{id}")
    public ResponseEntity<Curso> getCursoid(@PathVariable long id)
    {
        Curso curso = cursorepositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe , nadita de nada "+id));
        return ResponseEntity.ok(curso);
    }
    //Actualizar o editar curso
    @PutMapping("{id}")
    public ResponseEntity<Curso> UpdateCurso(@PathVariable long id,@RequestBody Curso cursodetalle)
    {
        Curso cursoUpdate = cursorepositorio.findById(id).
                orElseThrow(()-> new ResourceNotFoundException("No existe , nadita de nada "+id));
        cursoUpdate.setNombre(cursodetalle.getNombre());
        cursoUpdate.setDescripcion(cursodetalle.getDescripcion());
        cursoUpdate.setCosto(cursodetalle.getCosto());
        cursoUpdate.setHoras(cursodetalle.getHoras());
        cursoUpdate.setDirigido(cursodetalle.getDirigido());
        cursoUpdate.setModalidad(cursodetalle.getModalidad());
        cursorepositorio.save(cursoUpdate);
        return ResponseEntity.ok(cursoUpdate);
    }
}
