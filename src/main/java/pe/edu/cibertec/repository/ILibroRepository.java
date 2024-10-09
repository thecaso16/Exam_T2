package pe.edu.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.model.Libro;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Integer> {

}
