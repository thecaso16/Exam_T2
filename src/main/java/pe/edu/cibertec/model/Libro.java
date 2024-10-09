package pe.edu.cibertec.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int LibroID;

	@Column(name = "title")
	private String Titulo;

	@Column(name = "name_autor")
	private String NombreAutor;

	@Column(name = "surname_autor")
	private String ApellidoAutor;

	@Column(name = "category")
	private String Categoria;
	
	@Column(name = "price")
	private Double Precio;

	public Libro() {
		super();
	}

	public Libro(int libroID, String titulo, String nombreAutor, String apellidoAutor, String categoria,
			Double precio) {
		super();
		LibroID = libroID;
		Titulo = titulo;
		NombreAutor = nombreAutor;
		ApellidoAutor = apellidoAutor;
		Categoria = categoria;
		Precio = precio;
	}

	public int getLibroID() {
		return LibroID;
	}

	public void setLibroID(int libroID) {
		LibroID = libroID;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getNombreAutor() {
		return NombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		NombreAutor = nombreAutor;
	}

	public String getApellidoAutor() {
		return ApellidoAutor;
	}

	public void setApellidoAutor(String apellidoAutor) {
		ApellidoAutor = apellidoAutor;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}
    
}
