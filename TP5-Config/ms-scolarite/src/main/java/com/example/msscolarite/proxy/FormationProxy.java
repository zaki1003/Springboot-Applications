package com.example.msscolarite.proxy;


import com.example.msscolarite.model.Formation;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-formation")
@LoadBalancerClient(name="ms-formation",
        configuration =LBConfiguration.class )
public interface FormationProxy {
    @GetMapping("/formations/{id}")
    Formation getFormation(@PathVariable("id") Long idf);

}
