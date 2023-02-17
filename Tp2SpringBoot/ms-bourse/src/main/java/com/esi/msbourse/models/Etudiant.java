package com.esi.msbourse.models;

import lombok.Data;

import java.util.Date;
@Data
public class Etudiant {



    private String nomEtudiant;
    private String promo;
    private Date dateInscription;
    private String nomEtablissement;
    private Long NCompteCCP;
}
