package com.esi.msscolarity.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "toformation", types = Etudiant.class)

public interface ProjectionFormation {
    @Value("#{target.nom}")
    public String getNomEtudiant();

    @Value("#{target.etablissement.nom}")
    public String getNomEtablissement();

}


