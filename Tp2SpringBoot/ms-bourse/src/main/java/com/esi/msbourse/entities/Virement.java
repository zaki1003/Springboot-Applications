package com.esi.msbourse.entities;

import com.esi.msbourse.models.Etudiant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Virement {
    @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long idVirement;


    private Float montant;




    @Temporal(TemporalType.DATE)
    private Date dateVirement;



    private Long NCompteCCP;


    @Transient
    private Etudiant etudiant;



}
