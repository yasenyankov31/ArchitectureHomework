package org.gym.Training;

import org.gym.Training.Program.TrainingProgram;

public interface Subject {
    void attach(Trainee trainee, TrainingProgram trainingProgram);
    void detach(Trainee trainee);
    void notifyObservers();
}