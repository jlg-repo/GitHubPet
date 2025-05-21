package com.jasong.githubpet.githubpet;

import java.time.LocalDateTime;

public class Pet implements Interactable{
    private String name;
    protected int hunger;
    protected int happiness;
    protected int energy;
    protected boolean alive;
    protected LocalDateTime lastFeedTime;

    public Pet(String name) {
        this.name = name;
        this.hunger = 60;
        this.happiness = 60;
        this.energy = 100;
        this.alive = true;
        this.lastFeedTime = LocalDateTime.now();
    }

    public void feed() {
        if (!alive) return;
        hunger += 20;
        if (hunger > 100) hunger = 100;
        lastFeedTime = LocalDateTime.now();
    }

    public void play() {
        if (!alive) return;
        happiness += 20;
        energy -= 15;
        if (happiness > 100) happiness = 100;
        if (energy < 0) energy = 0;
    }
    public void tick() {
        if (!alive) return;

        //Decrease stats over time: placeholder logic
        hunger -= 5;
        happiness -= 3;
        energy -= 2;

        //bound the values
        if (hunger < 0) hunger = 0;
        if (happiness < 0) happiness = 0;
        if (energy < 0) energy = 0;

        // Check if pet dies from hunger ;(
        if (hunger <= 0 ) {
            alive = false;
        }
    }

    public boolean isAlive() {
        return alive;

    }

    @Override
    public void interact(String action) {
        if (action.equals("feed")) {
            feed();
        } else if (action.equals("play")) {
            play();
        }
    }

@Override
public String getStatus() {
    if (!alive) {
        return name + " has died! :(";

    }

    if (hunger < 30) {
        return name + " is very hungry!";
    } else if (happiness < 30) {
        return name +  " is sad!";
    } else if (energy < 30) {
        return name + " is tired!";

    } else {
        return name + " is happy to see you!";
    }
}

//Getters/Setters

public String getName() {return name;}
public int getHunger() { return hunger;}
public int getHappiness() {return happiness;}
public int getEnergy() { return energy;}
}
