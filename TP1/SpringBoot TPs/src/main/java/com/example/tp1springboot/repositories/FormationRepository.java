package com.example.tp1springboot.repositories;

import com.example.tp1springboot.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "formation", path = "formation")
public interface FormationRepository extends JpaRepository<Formation, Long> {

    Formation findByid(String id);



    List<Formation>  findFormationsByIdBefore(Long id);

    List<Formation> findFormationsByIdLessThan(Long id);
}