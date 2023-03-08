/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1Web.controller;

import CasoPractico1Web.entity.Pelicula;
import CasoPractico1Web.entity.Sala;
import CasoPractico1Web.service.IPeliculaService;
import CasoPractico1Web.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author joshu
 */
@Controller
public class PeliculaController {
    @Autowired
    private ISalaService SalaService;
     
      @Autowired
    private IPeliculaService PeliculaService;
      
      @GetMapping ("/pelicula")
   public String index(Model model){
       List <Pelicula> listaPelicula= PeliculaService.getAllPelicula();
       model.addAttribute ("titulo","Tabla Peliculas");
       model.addAttribute ("pelicula", listaPelicula);
       return "pelicula";
   }
   
   @GetMapping ("/peliculaN")
   public String crearPelicula (Model model){
       List <Sala> listaSala= SalaService.listSala();
       model.addAttribute("pelicula",new Pelicula());
       model.addAttribute("sala", listaSala);
       return "crear";
   }
   @PostMapping("/save")
   public String guardarPelicula(@ModelAttribute Pelicula pelicula){
       PeliculaService.savePelicula(pelicula);
       return "redirect:/pelicula";
   }
   
   @GetMapping("/editPelicula/{id}")
   public String editarPelicula (@PathVariable("id") Long idPelicula, Model model){
       Pelicula pelicula = PeliculaService.getPeliculaByID(idPelicula);
       List<Sala> listaSala = SalaService.listSala();
       model.addAttribute("pelicula", pelicula);
       model.addAttribute("sala", listaSala);
       return"crear";
   }
   
   @GetMapping("/delete/{id}")
   public String eliminarPelicula (@PathVariable("id") Long idPelicula)
   {
   PeliculaService.delete(idPelicula);
   return "redirect:/pelicula";
   }
    
}
