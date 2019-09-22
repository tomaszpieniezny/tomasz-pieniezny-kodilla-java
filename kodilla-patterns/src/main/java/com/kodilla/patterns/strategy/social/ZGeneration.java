package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialNetwork.TwitterPublisher;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.post = new TwitterPublisher();
    }
}
