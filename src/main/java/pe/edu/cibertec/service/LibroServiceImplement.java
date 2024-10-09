package pe.edu.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.model.Libro;
import pe.edu.cibertec.repository.ILibroRepository;

@Service
public class LibroServiceImplement implements ILibroService {

	@Autowired
	private ILibroRepository libroRepository;

	@Override
	public List<Libro> listarLibros() {
		return libroRepository.findAll();
	}
	
	@Override
	public Optional<Libro> obtenerLibroPorId(int id) {
		return libroRepository.findById(id);
	}

	@Override
	public Libro guardarLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public void eliminarLibro(int id) {
		libroRepository.deleteById(id);
	}
}
