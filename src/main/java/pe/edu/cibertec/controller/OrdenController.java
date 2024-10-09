package pe.edu.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.model.Orden;
import pe.edu.cibertec.service.IOrdenService;

@Controller
@RequestMapping("/ordenes")
public class OrdenController {

    @Autowired
    private IOrdenService servicio;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/listar")
    public String listarOrdenes(Model modelo) {
        modelo.addAttribute("ordenes", servicio.listarOrdenes());
        return "ordenes/listarOrdenes";
    }

    @GetMapping("/nuevo")
    public String newOrden(Model modelo) {
        modelo.addAttribute("orden", new Orden());
        return "ordenes/formOrdenes";
    }

    @PostMapping("/guardarOrden")
    public String saveOrden(@ModelAttribute Orden orden) {
        servicio.guardarOrden(orden);
        return "redirect:/ordenes/listar";
    }

    @GetMapping("/editar/{id}")
    public String editOrden(@PathVariable int id, Model modelo) {
        modelo.addAttribute("orden", servicio.obtenerOrdenPorId(id).orElse(new Orden()));
        return "ordenes/formOrdenes";
    }

    @GetMapping("/eliminar/{id}")
    public String deleteOrden(@PathVariable int id) {
        servicio.eliminarOrden(id);
        return "redirect:/ordenes/listar";
    }
}
