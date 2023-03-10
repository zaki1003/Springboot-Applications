package com.esisba.msscolarite.Repositories;


import com.esisba.msscolarite.entitied.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtablissementRepository
              extends JpaRepository<Etablissement, Long> {
}
