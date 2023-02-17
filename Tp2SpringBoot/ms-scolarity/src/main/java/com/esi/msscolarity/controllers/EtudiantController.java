package com.esi.msscolarity.controllers;

import com.esi.msscolarity.entities.Etudiant;
import com.esi.msscolarity.models.Formation;
import com.esi.msscolarity.models.Virement;
import com.esi.msscolarity.proxy.FormationProxy;
import com.esi.msscolarity.proxy.VirementProxy;
import com.esi.msscolarity.repositories.EtudiantRepository;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")

public class EtudiantController {


    @Autowired  // import repositories
    EtudiantRepository etdRepository;


    @Autowired  // import repositories
    FormationProxy formationProxy;

    @Autowired  // import repositories
    VirementProxy virementProxy;

    @RequestMapping(value="/etudiant/{etdId}/formation", method=RequestMethod.GET)
    public Etudiant readEtudiantsF(@PathVariable(value = "etdId") Long id) {

        Etudiant e = etdRepository.findById(id).get();
        Formation f = formationProxy.getFormation(e.getIdFormation());
     //   f.setIdFormation(e.getIdFormation());
        e.setFormation(f);
        return e;

    }
   /* @GetMapping("etudiant/formation")
    List<Etudiant> getEtudiants()
    {
        List<Etudiant> etudiants=etdRepository.findAll();


        Formation f = formationProxy.getFormation(e.getIdFormation());
        etudiants.forEach((e)->{
            e.setFormation(formationProxy.getFormation(e.getIdFormation()));
        });

        return  etudiants;
    }
*/


        @RequestMapping(value="/etudiant/{etdId}/virement", method=RequestMethod.GET)
        CollectionModel<Virement> getVirements(@PathVariable(value = "etdId") Long id) {
            {
                Etudiant etudiant = etdRepository.findById(id).get();

                CollectionModel<Virement> virements = virementProxy.getVirements(etudiant.getNCompteCCP());

                return virements;
            }


        }


  /*  @GetMapping("etudiant/1/etablissement")
    List<Etudiant> getEtudiants()
    {
        List<Etudiant> etudiants=etdRepository.findAll();


        Formation f = formationProxy.getFormation(e.getIdFormation());
        etudiants.forEach((e)->{
            e.setFormation(formationProxy.getFormation(e.getIdFormation()));
        });

        return  etudiants;
    } */

}