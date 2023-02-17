package com.example.tp1springboot;

import com.example.tp1springboot.entities.Etudiant;
import com.example.tp1springboot.entities.Formation;
import com.example.tp1springboot.repositories.EtudiantRepository;

import com.example.tp1springboot.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class Tp1SpringBootApplication {


	@Autowired
	EtudiantRepository etudiantRepository;
	public static void main(String[] args) {
		SpringApplication.run(Tp1SpringBootApplication.class, args);
	}




	@Bean
	public CommandLineRunner mappingdemo(FormationRepository formationRepository,
										 EtudiantRepository etudiantRepository) {
		return args -> {




			// create a new formation
	/*		Formation formation = new Formation(null,"Reseaux",null);
			Formation formation2 = new Formation(null,"SpringBoot",null);
			Formation formation3 = new Formation(null,"Python",null);
			// save the Formation
			formationRepository.save(formation);
			formationRepository.save(formation2);
			formationRepository.save(formation3);
			// create and save new etudiants
			etudiantRepository.save(new Etudiant(null, "Zaki",  formation, Date.valueOf("1999-03-10")));
			etudiantRepository.save(new Etudiant(null, "Mustapha",  formation,Date.valueOf("2000-03-10")));
			etudiantRepository.save(new Etudiant(null, "Merabet",  formation2,Date.valueOf("2001-03-10")));
			etudiantRepository.save(new Etudiant(null, "Mohamed",  formation3,Date.valueOf("1996-03-10")));
			etudiantRepository.save(new Etudiant(null, "Zakaria",  formation3,Date.valueOf("1995-03-10")));
*/

/*

			System.out.println("Tesssssssssssssssssssssset");
			System.out.println("Tesssssssssssssssssssssset");
			System.out.println("Tesssssssssssssssssssssset");
			System.out.println("Tesssssssssssssssssssssset");

			System.out.println("Q1");
			Etudiant c1= etudiantRepository.findEtudiantByNom("Mustapha");
			System.out.println("id==== " + c1.getId());
			System.out.println("Formation==== " + c1.getFormation().getNom());
			System.out.println("Date de naissance ==== " + c1.getDateNaissance());
			System.out.println("-----------------------");
			System.out.println("Q2");
			Etudiant c2= etudiantRepository.findByNomAndAndDateNaissanceAfter("Mustapha", Date.valueOf("1990-03-10"));
			System.out.println("id==== " + c2.getId());
			System.out.println("Formation==== " + c2.getFormation().getNom());
			System.out.println("-----------------------");
			System.out.println("Q3");
			System.out.println("Nom==== " + etudiantRepository.findNomById(c2.getId()));
		 //  etudiantRepository.updateDtById(c2.getId(),Date.valueOf("2001-03-10"));
			System.out.println("Nombre des etudiants pour la formation reseaux == " + etudiantRepository.findNbEtdByFname("reseaux"));
			*/};
	}

}
