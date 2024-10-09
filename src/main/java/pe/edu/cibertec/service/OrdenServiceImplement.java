package pe.edu.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.model.Orden;
import pe.edu.cibertec.repository.IOrdenRepository;

@Service
public class OrdenServiceImplement implements IOrdenService{
	
	@Autowired
	private IOrdenRepository ordenRepository;

	@Override
	public List<Orden> listarOrdenes() {
		return ordenRepository.findAll();
	}

	@Override
	public Optional<Orden> obtenerOrdenPorId(int id) {
		return ordenRepository.findById(id);
	}

	@Override
	public Orden guardarOrden(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public void eliminarOrden(int id) {
		ordenRepository.deleteById(id);
	}
}
