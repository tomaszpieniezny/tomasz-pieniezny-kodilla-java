package com.kodilla.good.patterns.challenges.allegro;

public class MailService implements InformationService{

    @Override
    public void information(User user){
        System.out.println(user.getUserName() + " Thank you for your order");
    }
}
