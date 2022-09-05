package cristian.net.pruebatecnica.repository;

import cristian.net.pruebatecnica.modelo.Modalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;

@Repository
public interface Modalidadrepositorio extends JpaRepository<Modalidad,Long> {

}
