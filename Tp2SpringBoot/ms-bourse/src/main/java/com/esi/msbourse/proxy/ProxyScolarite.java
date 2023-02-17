package com.esi.msbourse.proxy;

import com.esi.msbourse.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="ms-scolarite", url="localhost:8081")
public interface ProxyScolarite {


  /*  @GetMapping("/etudiants/search/findEtudiantByNCompteCCP")
    Etudiant getEtudinats(@RequestParam("nCCP") Long nCCP ,
                                           @RequestParam("projection") String p);
*/

    @GetMapping("/etudiants")
    CollectionModel<Etudiant> getEtudiants(
                                          @RequestParam("projection") String p);

}
