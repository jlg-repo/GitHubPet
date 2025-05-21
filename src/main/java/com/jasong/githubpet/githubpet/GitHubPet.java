package com.jasong.githubpet.githubpet;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GitHubPet extends Pet{
    private int codePoints;
    private int evolutionStage;
    private LocalDateTime lastCommitTime;

    public GitHubPet(String name) {
        super(name);
        this.codePoints = 0;
        this.evolutionStage = 0;
        this.evolutionStage = 1;
        this.lastCommitTime = LocalDateTime.now();
    }

    public void codeCommit() {
        //Placeholder: may extend with actual GitHub API
        if (!isAlive()) return;

        feed(); //Coding feeds the pet
        happiness += 10;
        if (happiness > 100) happiness = 100;

        codePoints += 10;
        lastCommitTime = LocalDateTime.now();

        //check for evolution
        if (codePoints >= evolutionStage * 100 && evolutionStage < 3) {
            evolve();
        }
    }

    private void evolve() {
        evolutionStage++;
    }

    @Override
    public void tick() {
        super.tick();

        //GitHub Pets get extra hungry when you don't code

        long hoursSinceLastCommit = ChronoUnit.HOURS.between(lastCommitTime, LocalDateTime.now());
        if (hoursSinceLastCommit > 24) {
            hunger -= 10;
            if (hunger < 0) hunger = 0;
        }


    }

    @Override
    public void interact(String action) {
        super.interact(action);
        if (action.equals("commit")) {
            codeCommit();
        }
    }

    @Override
    public String getStatus() {
        if (!isAlive()) {
            return getName() + " died from lack of coding!";
        }

        long hoursSinceLastCommit = ChronoUnit.HOURS.between(lastCommitTime, LocalDateTime.now());

        if (hoursSinceLastCommit > 48) {
            return getName() + " is starving for code commits!";
        } else if (hoursSinceLastCommit > 24) {
            return getName() + " needs you to commit some code soon!";
        } else {
            return super.getStatus() + " Evolution stage: " + evolutionStage;
        }
    }

    // Additional getters
    public int getCodePoints() { return codePoints; }
    public int getEvolutionStage() { return evolutionStage; }
    public LocalDateTime getLastCommitTime() { return lastCommitTime; }
}
