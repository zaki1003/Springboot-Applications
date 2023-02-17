package com.esi.msscolarity.proxy;


import com.esi.msscolarity.models.Formation;
import org.springframework.cloud.openfeign.FeignClient;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="ms-formation", url="localhost:8082")
public interface FormationProxy {

  // localhost:8081/formations/1
  //formations url de JpaRespository
    @GetMapping("/formations/{id}")
    Formation getFormation(@PathVariable("id") Long id);


}
