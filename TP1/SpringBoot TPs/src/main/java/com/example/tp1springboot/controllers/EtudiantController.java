package com.example.tp1springboot.controllers;
import com.example.tp1springboot.entities.Etudiant;
import com.example.tp1springboot.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EtudiantController {


    @Autowired
    EtudiantService etdService;
    @RequestMapping(value="/etudiant/all", method=RequestMethod.GET)
    public List<Etudiant> readEtudiants() {
        return etdService.getEtudiants();
    }


    @RequestMapping(value="/etudiant/{etdId}", method=RequestMethod.GET)
    public Etudiant readEtudiants(@PathVariable(value = "etdId") Long id) {

        return etdService.getEtudiant(id);
    }


    @RequestMapping(value="/etudiant", method=RequestMethod.POST)
    public Etudiant createEtudiant(@RequestBody Etudiant etd) {
        return etdService.createEtudiant(etd);
    }


    @RequestMapping(value="/etudiant/{etdId}", method=RequestMethod.PUT)
    public Etudiant readEtudiants(@PathVariable(value = "etdId") Long id, @RequestBody Etudiant etdDetails) {
        return etdService.updateEtudiant(id, etdDetails);
    }

    @RequestMapping(value="/etudiant/{etdId}", method=RequestMethod.DELETE)
    public void deleteEtudiants(@PathVariable(value = "etdId") Long id) {
        etdService.deleteEtudiant(id);
    }
}