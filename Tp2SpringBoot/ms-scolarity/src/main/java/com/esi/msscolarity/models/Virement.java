package com.esi.msscolarity.models;

import lombok.Data;

import java.util.Date;


public @Data
class Virement {

    private Long idVirement;
    private Float montant;
    private Long NCompteCCP;
    private Date dateVirement;
}
