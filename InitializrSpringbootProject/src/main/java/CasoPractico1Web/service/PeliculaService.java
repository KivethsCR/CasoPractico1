/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1Web.service;

import CasoPractico1Web.entity.Pelicula;
import CasoPractico1Web.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joshu
 */
@Service
public class PeliculaService implements IPeliculaService{
    @Autowired
    private PeliculaRepository PeliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List <Pelicula>)PeliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaByID(long id) {
        return PeliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        PeliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        PeliculaRepository.deleteById(id);
    }
    
}
