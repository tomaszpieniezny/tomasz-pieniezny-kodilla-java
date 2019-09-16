package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class World {
    private List<Continent> continentList = new ArrayList<>();

    public BigDecimal getPeopleQuantity(Continent continent) {
        return continentList.stream()
                .flatMap(continent1 -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
