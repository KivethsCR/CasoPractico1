/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1Web.service;

import CasoPractico1Web.entity.Pelicula;
import java.util.List;

/**
 *
 * @author joshu
 */
public interface IPeliculaService {
    public List <Pelicula> getAllPelicula();
    public Pelicula getPeliculaByID (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
    
}
