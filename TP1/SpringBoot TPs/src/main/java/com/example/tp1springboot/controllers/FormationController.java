package com.example.tp1springboot.controllers;

import com.example.tp1springboot.entities.Etudiant;
import com.example.tp1springboot.repositories.EtudiantRepository;
import com.example.tp1springboot.repositories.FormationRepository;
import com.example.tp1springboot.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class FormationController {


    @Autowired
    private FormationRepository formationRepository;
    @Autowired
    private EtudiantRepository etdRepository;

    @GetMapping
    public List<Formation> findAllUsers() {
        return formationRepository.findAll();
    }



    @RequestMapping(value="/formation/{etdId}", method=RequestMethod.GET)
    public Formation readFormation1(@PathVariable(value = "etdId") Long id) {

        return formationRepository.findById(id).get();
    }


   @GetMapping("/formation")
    public Formation readFormation2(@RequestParam("id") Long id) {

        return formationRepository.findById(id).get();
    }



    @RequestMapping(value="/formation/{etdId}", method= RequestMethod.DELETE)
    public void deleteFormations(@PathVariable(value = "etdId") Long id) {
  Formation f =formationRepository.findById(id).get();
        List<Etudiant> etudiants= f.getEtudiants();

        for (Etudiant e:etudiants
             ) {
           Etudiant etd = etdRepository.findById(e.getId()).get();
           e.setFormation(null);
           etdRepository.save(e);

        }
       formationRepository.deleteById(id);
    }
}
