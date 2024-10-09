package pe.edu.cibertec.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrdenId;

	@Column(name = "ClienteID")
	private int ClienteID;

	@ManyToOne
	@JoinColumn(name = "LibroID")
	private Libro libro;

	@Column(name = "Fecha_orden")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date FechaOrden;

	public Orden() {
		super();
	}

	public Orden(int ordenId, int clienteID, Libro libro, Date fechaOrden) {
		super();
		OrdenId = ordenId;
		ClienteID = clienteID;
		this.libro = libro;
		FechaOrden = fechaOrden;
	}

	public int getOrdenId() {
		return OrdenId;
	}

	public void setOrdenId(int ordenId) {
		OrdenId = ordenId;
	}

	public int getClienteID() {
		return ClienteID;
	}

	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Date getFechaOrden() {
		return FechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		FechaOrden = fechaOrden;
	}
	
	
}
