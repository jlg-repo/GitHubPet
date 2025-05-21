package com.jasong.githubpet.githubpet;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.util.Duration;

public class PetController implements Initializable {
    private Pet pet;
    private Timeline timeline;

    @FXML
    private Label petStateLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private Label evolutionLabel;

    @FXML
    private ProgressBar hungerBar;

    @FXML
    private ProgressBar happinessBar;

    @FXML
    private ProgressBar energyBar;

    @FXML
    private Button feedButton;

    @FXML
    private Button playButton;

    @FXML
    private Button commitButton;

    @FXML
    private Button catButton;

    @FXML
    private Button dogButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Setup timeline for periodic updates
        setupTimeline();

        // Disable action buttons until a pet is selected
        feedButton.setDisable(true);
        playButton.setDisable(true);
        commitButton.setDisable(true);

    }

    @FXML
    private void selectCat() {
        pet = new Cat("Codey the Cat");
        updateUI();
        enableButtons();
    }

    @FXML
    private void selectDog() {
        pet = new Dog("Gitty the Dog");
        updateUI();
        enableButtons();
    }

    @FXML
    private void feedPet() {
        if (pet != null) {
            pet.interact("feed");
            updateUI();

        }
    }

    @FXML
    private void playWithPet() {
        if (pet != null) {
            pet.interact("play");
            updateUI();


        }
    }

    @FXML
    private void commitCode() {
        if (pet instanceof GitHubPet) {
            ((GitHubPet) pet).codeCommit();
            updateUI();

        }
    }

    private void setupTimeline() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
            if (pet != null) {
                pet.tick();
                updateUI();
            }
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void enableButtons() {
        feedButton.setDisable(false);
        playButton.setDisable(false);
        commitButton.setDisable(false);
    }

    private void updateUI() {
        if (pet == null) return;

        // Update progress bars
        hungerBar.setProgress(pet.getHunger() / 100.0);
        happinessBar.setProgress(pet.getHappiness() / 100.0);
        energyBar.setProgress(pet.getEnergy() / 100.0);

        // Update status message
        statusLabel.setText(pet.getStatus());

        // Update pet emoji based on type and state
        if (!pet.isAlive()) {
            petStateLabel.setText("💀");
            disableButtons();
        } else if (pet instanceof Cat) {
            petStateLabel.setText("😺");
        } else if (pet instanceof Dog) {
            petStateLabel.setText("🐶");
        }

        // Update evolution label if it's a GitHub pet
        if (pet instanceof GitHubPet) {
            GitHubPet githubPet = (GitHubPet) pet;
            evolutionLabel.setText("Evolution Stage: " + githubPet.getEvolutionStage() +
                    " | Code Points: " + githubPet.getCodePoints());
            evolutionLabel.setVisible(true);
        } else {
            evolutionLabel.setVisible(false);
        }
    }

    private void disableButtons() {
        feedButton.setDisable(true);
        playButton.setDisable(true);
        commitButton.setDisable(true);
    }
}