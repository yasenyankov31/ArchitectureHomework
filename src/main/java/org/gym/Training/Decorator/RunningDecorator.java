package org.gym.Training.Decorator;

import org.gym.Training.Program.TrainingProgram;

public class RunningDecorator extends TrainingProgramDecorator {
    public RunningDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String execute() {
        return trainingProgram.execute() + " with Running";
    }
}