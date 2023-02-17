package com.esi.msformation.entities;

import com.esi.msformation.model.Etudiant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Formation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFormation;


    @Column(nullable = false, length = 20)
    private String nom;



    @Transient
    private Collection<Etudiant> etudiants;






}
