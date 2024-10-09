package pe.edu.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.model.Libro;
import pe.edu.cibertec.service.ILibroService;

@Controller
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private ILibroService servicio;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/listarLibros")
    public String listarLibros(Model modelo) {
        modelo.addAttribute("listarLibros", servicio.listarLibros());
        return "libros/listarLibros";
    }

    @GetMapping("/nuevo")
    public String newLibro(Model modelo) {
        modelo.addAttribute("libro", new Libro());
        return "libros/formLibros";
    }

    @PostMapping("/guardar")
    public String saveLibro(@ModelAttribute Libro libro) {
        servicio.guardarLibro(libro);
        return "redirect:/libros/listarLibros";
    }

    @GetMapping("/editar/{id}")
    public String editLibro(@PathVariable int id, Model modelo) {
        modelo.addAttribute("libro", servicio.obtenerLibroPorId(id));
        return "libros/formLibros";
    }

    @GetMapping("/eliminar/{id}")
    public String deleteLibro(@PathVariable int id) {
        servicio.eliminarLibro(id);
        return "redirect:/libros/listarLibros";
    }
}
