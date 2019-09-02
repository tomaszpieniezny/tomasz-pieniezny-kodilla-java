package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String nameCountry;
    private BigDecimal peopleQuantity;

    public Country(String nameCountry, BigDecimal peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
