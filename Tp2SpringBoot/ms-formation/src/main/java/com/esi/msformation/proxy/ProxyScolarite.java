package com.esi.msformation.proxy;

import com.esi.msformation.model.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name="ms-scolarite", url="localhost:8081")
public interface ProxyScolarite {


    @GetMapping("/etudiants/search/findEtudiantsByIdFormation")
    CollectionModel<Etudiant> getEtudinats(@RequestParam("idf") Long idf ,
                                          @RequestParam("projection") String p);
}
