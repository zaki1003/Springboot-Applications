package com.example.tp1springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "formations")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Formation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 20)
    private String nom;



    @JsonIgnore
    @OneToMany(mappedBy="formation")
    private List<Etudiant> etudiants;








}
