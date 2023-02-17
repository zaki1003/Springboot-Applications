package com.esisba.msformation;

import com.esisba.msformation.entities.Formation;
import com.esisba.msformation.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication

public class MsFormationApplication {

    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }



    @Bean
    public CommandLineRunner mappingdemo(FormationRepository formationRepository
                                         ) {
        return args -> {

            repositoryRestConfiguration.exposeIdsFor(Formation.class);
			// create a new formation
			Formation formation = new Formation(null,"Reseaux",null);
			Formation formation2 = new Formation(null,"SpringBoot",null);
			// save the Formation




            formationRepository.save(formation);
			formationRepository.save(formation2);



};
    }

}
