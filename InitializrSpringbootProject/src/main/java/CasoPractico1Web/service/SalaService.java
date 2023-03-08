/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1Web.service;

import CasoPractico1Web.entity.Sala;
import CasoPractico1Web.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author joshu
 */
public class SalaService implements ISalaService{
    @Autowired
    private SalaRepository SalaRepository;

    @Override
    public List<Sala> listSala() {
        return (List<Sala>) SalaRepository.findAll();
    }
    
}
