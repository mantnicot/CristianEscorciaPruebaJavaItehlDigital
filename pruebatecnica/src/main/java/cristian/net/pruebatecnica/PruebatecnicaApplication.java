package cristian.net.pruebatecnica;

import cristian.net.pruebatecnica.modelo.Curso;
import cristian.net.pruebatecnica.modelo.Descuentos;
import cristian.net.pruebatecnica.modelo.Modalidad;
import cristian.net.pruebatecnica.repository.Cursorepositorio;
import cristian.net.pruebatecnica.repository.Descuentorepositorio;
import cristian.net.pruebatecnica.repository.Modalidadrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class PruebatecnicaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PruebatecnicaApplication.class, args);
	}
	/*@Autowired*/
	/*private Modalidadrepositorio modalidadrepositorio;*/
	/*private Cursorepositorio cursorepositorio;*/
	/*private Descuentorepositorio descuentorepositorio;*/
	@Override
	public void run(String... args) throws Exception {

		/*Modalidad modalidad = new Modalidad();
		modalidad.setNombre("Privado");
		modalidad.setDescripcion("Es una modalidad enfocada en ambito privados");
		modalidadrepositorio.save(modalidad);

		Modalidad modalidad1 = new Modalidad();
		modalidad1.setNombre("Online");
		modalidad1.setDescripcion("Es una modalidad virtual por medio de redes y aulas virtuales");
		modalidadrepositorio.save(modalidad1);

		Modalidad modalidad2 = new Modalidad();
		modalidad2.setNombre("Ondemand");
		modalidad2.setDescripcion("Es una modalidad enfocada en la cantidad de personas que demanden el curso");
		modalidadrepositorio.save(modalidad2);*/

	}
}
