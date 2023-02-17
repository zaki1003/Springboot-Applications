package com.example.tp1springboot.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="pr1", types= Etudiant.class)
public interface EtudiantProjection {



        public String getNom();
       /* @Value("#{target.formation.nom}")
        public String getNomFormation();*/




}
