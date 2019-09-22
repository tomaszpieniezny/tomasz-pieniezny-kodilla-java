package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher post;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost(){
        return post.share();
    }

     public void setSharePost(SocialPublisher post){
        this.post = post;
     }

}
