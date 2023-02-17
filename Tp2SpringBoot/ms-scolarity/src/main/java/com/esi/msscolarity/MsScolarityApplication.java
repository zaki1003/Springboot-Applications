package com.esi.msscolarity;

import com.esi.msscolarity.entities.Etablissement;
import com.esi.msscolarity.entities.Etudiant;
import com.esi.msscolarity.models.Formation;
import com.esi.msscolarity.repositories.EtablissementRepository;
import com.esi.msscolarity.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class MsScolarityApplication {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EtablissementRepository etablissementRepository;
    public static void main(String[] args) {
        SpringApplication.run(MsScolarityApplication.class, args);
    }




    @Bean
    public CommandLineRunner mappingdemo(EtudiantRepository etudiantRepository) {
        return args -> {



            Etablissement e1=etablissementRepository.save(new Etablissement(null,"esi-sba",null));
            Etablissement e2=etablissementRepository.save(new Etablissement(null,"univ-sba",null));

			// create and save new etudiants
			etudiantRepository.save(new Etudiant(null, "Zaki", Date.valueOf("1999-01-01"), "4ISI",Date.valueOf("2020-09-01"),1L,null,1L,null,e1));
			etudiantRepository.save(new Etudiant(null, "Mustapha",Date.valueOf("2000-01-01"), "SIW",Date.valueOf("2021-09-01"),2L,null, 2L,null,e1));
			etudiantRepository.save(new Etudiant(null, "Merabet", Date.valueOf("2001-01-01"), "4ISI",Date.valueOf("2021-09-01"),3L,null, 1L,null,e2));
            etudiantRepository.save(new Etudiant(null, "Etudiant non boursier", Date.valueOf("2000-01-01"), "4ISI",Date.valueOf("2021-09-01"),null,null, 1L,null,e2));

};
    }

}
