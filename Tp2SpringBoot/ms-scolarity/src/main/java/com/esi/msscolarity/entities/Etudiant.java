
package com.esi.msscolarity.entities;

import com.esi.msscolarity.models.Formation;

import com.esi.msscolarity.models.Virement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEtudiant;


    @Column(nullable = false, length = 40)
    private String nom;



    @Temporal(TemporalType.DATE)
    private Date dateN;
    private String promo;
    @Temporal(TemporalType.DATE)
    private Date dateInscription;



    private Long NCompteCCP;


    @Transient
    private Virement virement;



    @Column
    private Long idFormation;


    @Transient
    private Formation formation;


    @ManyToOne
    private Etablissement etablissement;

}
