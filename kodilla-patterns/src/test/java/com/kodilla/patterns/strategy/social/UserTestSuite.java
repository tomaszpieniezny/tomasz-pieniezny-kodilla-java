package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialNetwork.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User tom = new Millenials("Tomasz Pieniezny");
        User mark = new YGeneration("Marek Nowak");
        User anna = new ZGeneration("Anna Steel");
        //When
        String tomPost = tom.sharePost();
        String markpost = mark.sharePost();
        String annapost = anna.sharePost();
        //Then
        Assert.assertEquals("Facebook", tomPost);
        Assert.assertEquals("Snapchat", markpost);
        Assert.assertEquals("Twitter",annapost);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User tom = new Millenials("Tomasz Pieniezny");
        //When
        String tomPost = tom.sharePost();
        tom.setSharePost(new TwitterPublisher());
        tomPost = tom.sharePost();
        //Then
        Assert.assertEquals("Twitter",tomPost);
    }
}
