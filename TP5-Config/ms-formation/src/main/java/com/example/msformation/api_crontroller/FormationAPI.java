package com.example.msformation.api_crontroller;

import com.example.msformation.Repositories.FormationRepository;
import com.example.msformation.entities.Formation;
import com.example.msformation.models.Strudent;
import com.example.msformation.proxies.PtoxyScolarite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("api")
@RefreshScope
public class FormationAPI {


    @Autowired
    FormationRepository formationRepository;

    @Autowired
    PtoxyScolarite ptoxyScolarite;

    @Value("${mes-config.email}")
    private String email;

    @GetMapping("email")
    public  String getEmail(){
        return  email;
    }

    @GetMapping("formation/{id}")
    Formation getFormationWithStudent(@PathVariable("id") Long idf)
    {
        Formation formation=formationRepository.findById(idf).get();
        formation.setEtudiants(
                new ArrayList<Strudent>(ptoxyScolarite.getEtudinats(idf,"toformation").getContent()));
         return formation;
    }
}
