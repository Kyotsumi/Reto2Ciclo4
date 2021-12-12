/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2_web.repositorio;


import Reto2_web.interfaces.InterfaceFragance;
import Reto2_web.modelo.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @FSBIO ORTIZ
 */
@Repository
public class FraganceRepository {
    @Autowired
    private InterfaceFragance repository;

    public List<Fragance> getAll() {
        return repository.findAll();
    }

    public Optional<Fragance> getClothe(String reference) {
        return repository.findById(reference);
    }

    
    public Fragance create(Fragance clothe) {
        return repository.save(clothe);
    }

    public void update(Fragance clothe) {
        repository.save(clothe);
    }
    
    public void delete(Fragance clothe) {
        repository.delete(clothe);
    }
}
