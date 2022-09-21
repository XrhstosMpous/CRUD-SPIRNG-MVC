/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.models.Trainer;
import java.util.List;

/**
 *
 * @author PSO
 */
public interface TrainerServiceInterface {
    
    
    
    
    
    
    public List<Trainer> getAllTrainers();
    
    
    public  Trainer getTrainerById(Integer id);
    
    
    public void deleteTrainer(Integer id);
    
    
    public Trainer saveTrainer(Trainer trainer);
    
}
