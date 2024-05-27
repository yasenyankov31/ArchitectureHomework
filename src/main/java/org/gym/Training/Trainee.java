package org.gym.Training;

import org.gym.Training.Program.TrainingProgram;

public class Trainee implements Observer {
    private String name;

    public Trainee(String name) {
        this.name = name;
    }

    public void update(TrainingProgram trainingProgram) {
        System.out.println(name + " has been notified of the new training program: " + trainingProgram.execute());
    }
}
