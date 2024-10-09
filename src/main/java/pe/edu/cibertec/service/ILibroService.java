package pe.edu.cibertec.service;

import java.util.List;
import java.util.Optional;

import pe.edu.cibertec.model.Libro;

public interface ILibroService {
	List<Libro> listarLibros();
	Optional<Libro> obtenerLibroPorId(int id);
	Libro guardarLibro(Libro libro);
	void eliminarLibro(int id);
}
