package org.gym.Training.Decorator;

import org.gym.Training.Program.TrainingProgram;

public class SwimmingDecorator extends TrainingProgramDecorator {
    public SwimmingDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String execute() {
        return trainingProgram.execute() + " with Swimming";
    }
}