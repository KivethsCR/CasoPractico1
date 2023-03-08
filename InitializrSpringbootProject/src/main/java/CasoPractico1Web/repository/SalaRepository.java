/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1Web.repository;

import CasoPractico1Web.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author joshu
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala,Long> {
    
}
