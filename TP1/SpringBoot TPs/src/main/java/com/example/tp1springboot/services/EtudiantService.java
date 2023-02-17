package com.example.tp1springboot.services;


import com.example.tp1springboot.repositories.EtudiantRepository;
import com.example.tp1springboot.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    EtudiantRepository etdRepository;



    // CREATE
    public Etudiant createEtudiant(Etudiant emp) {
        return etdRepository.save(emp);
    }

    // READ
    public List<Etudiant> getEtudiants() {
        return etdRepository.findAll();
    }
    public Etudiant getEtudiant(Long etdId) {
        return etdRepository.findById(etdId).get();
    }

    // DELETE
    public void deleteEtudiant(Long etdId) {
        etdRepository.deleteById(etdId);
    }



    // UPDATE
    public Etudiant updateEtudiant(Long empId, Etudiant etudiantDt) {
        Etudiant emp = etdRepository.findById(empId).get();
        emp.setNom(etudiantDt.getNom());
        emp.setFormation(etudiantDt.getFormation());
        emp.setDateNaissance(etudiantDt.getDateNaissance());

        return etdRepository.save(emp);
    }



}