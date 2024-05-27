package org.gym.Training.Decorator;

import org.gym.Training.Program.TrainingProgram;

public class YogaDecorator extends TrainingProgramDecorator {
    public YogaDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String execute() {
        return trainingProgram.execute() + " with Yoga";
    }
}