package com.example.tp1springboot.entities;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="pr2", types= Formation.class)
public interface FormationProjection {



    public String getNom();

    @Value("#{target.etudiants.toArray()}")
   public List<String> getEtudiants();




}
