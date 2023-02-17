package com.esi.msscolarity.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "toVirement", types = Etudiant.class)

public interface ProjectionVirement {


    @Value("#{target.nom}")
    public String getNomEtudiant();


    @Value("#{target.promo}")
    public String getPromo();

    @Value("#{target.dateInscription}")
    public Date getdateInscription();

    @Value("#{target.etablissement.nom}")
    public String getNomEtablissement();



    @Value("#{target.nCompteCCP}")
    public String getNCompteCCP();
}
