package com.esi.msformation.controller;

import com.esi.msformation.entities.Formation;

import com.esi.msformation.proxy.ProxyScolarite;
import com.esi.msformation.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class FormationController {

    @Autowired
    FormationRepository formationRepository;

    @Autowired
    ProxyScolarite proxyScolarite;

    @GetMapping("formation/{id}")
    Formation getFormationWithStudent(@PathVariable("id") Long idf)
    {

        Formation formation=formationRepository.findById(idf).get();
        formation.setEtudiants(
                new ArrayList<>(proxyScolarite.getEtudinats(idf  ,"toformation").getContent()));

        return formation;
    }

}
