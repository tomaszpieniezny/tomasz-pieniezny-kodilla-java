package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialNetwork.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.post = new FacebookPublisher();
    }
}
