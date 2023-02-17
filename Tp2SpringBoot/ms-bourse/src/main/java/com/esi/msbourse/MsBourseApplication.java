package com.esi.msbourse;

import com.esi.msbourse.entities.Virement;
import com.esi.msbourse.repositories.VirementRepository;
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
public class MsBourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBourseApplication.class, args);
    }
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;




    @Bean
    public CommandLineRunner mappingdemo(VirementRepository virementRepository
    ) {
        return args -> {

            repositoryRestConfiguration.exposeIdsFor(Virement.class);
            // create a new formation
            Virement virement1 = new Virement(null,2000F, Date.valueOf("2022-01-01"),1L,null);
            Virement virement1_2 = new Virement(null,2050F, Date.valueOf("2022-02-01"),1L,null);
            Virement virement1_3 = new Virement(null,2000F, Date.valueOf("2022-03-01"),1L,null);
            Virement virement2 = new Virement(null,3000F, Date.valueOf("2022-02-01"),2L,null);
            Virement virement2_1 = new Virement(null,2500F, Date.valueOf("2022-03-01"),2L,null);
            Virement virement3 =new Virement(null,1500F, Date.valueOf("2022-03-01"),3L,null);
            Virement virement3_2 = new Virement(null,3000F, Date.valueOf("2022-02-01"),3L,null);
            // save the Formation


            virementRepository.save(virement1);
            virementRepository.save(virement1_2);
            virementRepository.save(virement1_3);
            virementRepository.save(virement2_1);
            virementRepository.save(virement3_2);


            virementRepository.save(virement2);
            virementRepository.save(virement3);



        };
    }

}
