package com.example.tp1springboot.repositories;


import com.example.tp1springboot.entities.Etudiant;
import com.example.tp1springboot.entities.Formation;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;
@RepositoryRestResource(collectionResourceRel = "etudiant", path = "etudiant")
public interface EtudiantRepository  extends JpaRepository<Etudiant, Long> {

Etudiant findEtudiantById(Long id);

   List<Etudiant> findEtudiantsByNom(String nom);

   List<Etudiant> findByNomAndAndDateNaissanceAfter(String n, Date d);


   @Query("SELECT e.nom FROM Etudiant e where e.id = :id")
   String findNomById(@Param("id") Long id);


@Modifying
   @Query("update  Etudiant e SET e.dateNaissance = :dt where e.id = :id")
   void updateEtudiantDtbyId(@Param("id") Long id ,@Param("dt") Date dt );


   @Modifying
   @Query("update  Etudiant e SET e.formation = :fr where e.id = :id")
   void updateEtudiantFrbyId(@Param("id") Long id ,@Param("fr") Formation fr );




   @Query("SELECT count(f) FROM Formation f , Etudiant e where f.id=e.formation.id and f.nom= :fname")
   String findNbEtdByFname(@Param("fname") String fname);



}
