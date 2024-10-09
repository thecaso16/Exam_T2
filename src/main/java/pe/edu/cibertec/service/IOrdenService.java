package pe.edu.cibertec.service;

import java.util.List;
import java.util.Optional;

import pe.edu.cibertec.model.Orden;

public interface IOrdenService {
	List<Orden> listarOrdenes();
	Optional<Orden> obtenerOrdenPorId(int id);
	Orden guardarOrden(Orden orden);
	void eliminarOrden(int id);
}
