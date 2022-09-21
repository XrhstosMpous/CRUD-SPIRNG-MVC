/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.models.Trainer;
import com.example.demo.repos.TrainerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PSO
 */

@Service
public class TrainerServiceImp implements TrainerServiceInterface {
    
 @Autowired
 TrainerRepository tr;   

    

    @Override
    public List<Trainer> getAllTrainers() {
       return tr.findAll();
        
    }

    
    @Override
    public Trainer getTrainerById(Integer id) {
        return (tr.findById(id).get());
    }

    @Override
    @Transactional
    public void deleteTrainer(Integer id) {
        tr.deleteById(id);
    }
    
    @Override
    @Transactional
    public Trainer saveTrainer(Trainer trainer){
       return  (tr.save(trainer));
        
    }
 
 
 
 
 
    
}
