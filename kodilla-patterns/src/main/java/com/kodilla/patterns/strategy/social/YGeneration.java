package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialNetwork.SnapchatPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.post = new SnapchatPublisher();
    }
}
