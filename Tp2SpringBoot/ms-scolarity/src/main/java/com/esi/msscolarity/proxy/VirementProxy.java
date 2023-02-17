package com.esi.msscolarity.proxy;

import com.esi.msscolarity.models.Formation;
import com.esi.msscolarity.models.Virement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="ms-virement", url="localhost:8083")

public interface VirementProxy {

    @GetMapping("/virements/search/findVirementsByNCompteCCP")
    CollectionModel<Virement> getVirements(@RequestParam("n") Long nCCP /*,
                                          @RequestParam("projection") String p*/);


}
