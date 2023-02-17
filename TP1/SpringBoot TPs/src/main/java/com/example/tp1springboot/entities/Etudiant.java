package com.example.tp1springboot.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "etudiants")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 20)
    private String nom;


    @ManyToOne
   // @JsonIgnore
 //   @JoinColumn(name="formation_id",nullable = true )    hadi ziyada mais dir erreur f delete formation
    private Formation formation;




    @Temporal(TemporalType.DATE)
    private Date dateNaissance;


}
