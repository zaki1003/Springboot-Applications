package com.esi.msbourse.controllers;

import com.esi.msbourse.entities.Virement;
import com.esi.msbourse.models.Etudiant;
import com.esi.msbourse.proxy.ProxyScolarite;
import com.esi.msbourse.repositories.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VirementController {

    @Autowired
    VirementRepository virementRepository;

    @Autowired
    ProxyScolarite proxyScolarite;

    @GetMapping("/virement/all")
    List<Etudiant> getEtudiants()
    {

        List<Etudiant> etudiantsB = new ArrayList<Etudiant>();
        CollectionModel<Etudiant> etudiants=proxyScolarite.getEtudiants("toVirement");

       // List<Virement> virements=virementRepository.findAll();

        etudiants.forEach(etudiant -> {

            List<Virement>   v = virementRepository.findVirementsByNCompteCCP(etudiant.getNCompteCCP());
if (!v.isEmpty()) etudiantsB.add(etudiant);
        });

        return  etudiantsB;
    }

 /*   @GetMapping("virement/{id}")
    Formation getFormationWithStudent(@PathVariable("id") Long idf)
    {

        Formation formation=formationRepository.findById(idf).get();
        formation.setEtudiants(
                new ArrayList<>(proxyScolarite.getEtudinats(idf  ,"toformation").getContent()));

        return formation;
    }
*/
}
