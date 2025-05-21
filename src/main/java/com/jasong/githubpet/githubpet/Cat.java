package com.jasong.githubpet.githubpet;

public class Cat extends GitHubPet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getStatus() {
        String baseStatus = super.getStatus();
        return "😺 " + baseStatus + " *purrs*";
    }

    public String purr() {
        return "Your cat purrs even though your code is awful";
    }

    //Cat specific polymorphic method
    @Override
    public void play() {
        super.play();
        happiness += 10; //cats really like playing
        if (happiness > 100) happiness = 100;
    }
}
