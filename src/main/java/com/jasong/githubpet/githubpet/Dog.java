package com.jasong.githubpet.githubpet;

public class Dog extends GitHubPet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getStatus() {
        String baseStatus = super.getStatus();
        return "🐶 " + baseStatus + " *wags tail*";
    }

    public String bark() {
        return "Your dog loves your code! At least somebody does";
    }

    // Dog-specific method demonstrating polymorphism
    @Override
    public void feed() {
        super.feed();
        // Dogs gain extra energy from food
        energy += 15;
        if (energy > 100) energy = 100;
    }

}
