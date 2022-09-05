package cristian.net.pruebatecnica.repository;

import cristian.net.pruebatecnica.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cursorepositorio extends JpaRepository<Curso, Long > {
}
