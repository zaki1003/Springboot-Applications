package com.esi.msscolarity.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etablissement {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 20)
    private String nom;

@JsonIgnore
    @OneToMany(mappedBy = "etablissement")
    private List<Etudiant> etudiant;
}
