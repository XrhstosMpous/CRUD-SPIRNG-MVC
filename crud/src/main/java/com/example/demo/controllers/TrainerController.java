/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.models.Trainer;
import com.example.demo.services.TrainerServiceInterface;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PSO
 */
@Controller
public class TrainerController {
    
    @Autowired
    TrainerServiceInterface trai;
    
    @GetMapping({"/showTrainers","/","list"})
    public ModelAndView showTrainers(){
          ModelAndView mav=new ModelAndView("list-trainers");  
         List<Trainer> list= trai.getAllTrainers();
         mav.addObject("trainers", list);
         return mav;
        }
    
    @GetMapping("/addTrainerForm")
    public ModelAndView addTrainer(){
        ModelAndView mav=new ModelAndView("add-trainer-form");
        Trainer newTrainer=new Trainer();
        mav.addObject("trainer", newTrainer);
        return mav;
        }
    @PostMapping("/saveTrainer")
    public String saveTrainer(@Valid @ModelAttribute Trainer trainer){
    trai.saveTrainer(trainer);
    return "redirect:/list";
        }
     
    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer trainerId){
    ModelAndView mav=new ModelAndView("add-trainer-form");
     Trainer trainer= trai.getTrainerById(trainerId);
     mav.addObject("trainer", trainer);
     return mav;
    
    }
    
    @GetMapping("/deleteTrainer")
    public String deleteTrainer(@RequestParam Integer trainerId){
    trai.deleteTrainer(trainerId);
    return "redirect:/list";
    }
            
    
}
