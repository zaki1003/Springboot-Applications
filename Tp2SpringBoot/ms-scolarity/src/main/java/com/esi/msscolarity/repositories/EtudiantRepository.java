package com.esi.msscolarity.repositories;

import com.esi.msscolarity.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.hateoas.CollectionModel;

import java.util.List;


@RepositoryRestResource
public interface EtudiantRepository  extends JpaRepository<Etudiant, Long> {

    List<Etudiant> findEtudiantsByIdFormation(Long idf);
    Etudiant findEtudiantByNCompteCCP(Long nCCP);
}
