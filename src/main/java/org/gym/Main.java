package org.gym;

import org.gym.Training.Decorator.RunningDecorator;
import org.gym.Training.Decorator.SwimmingDecorator;
import org.gym.Training.Decorator.YogaDecorator;
import org.gym.Training.FitnessCenter;
import org.gym.Training.Program.BasicTrainingProgram;
import org.gym.Training.Program.CardioTrainingProgram;
import org.gym.Training.Program.StrengthTrainingProgram;
import org.gym.Training.Program.TrainingProgram;
import org.gym.Training.Trainee;

public class Main {
    public static void main(String[] args) {
        FitnessCenter fitnessCenter = FitnessCenter.getInstance();

        TrainingProgram basicProgram = new BasicTrainingProgram();

        Trainee trainee1 = new Trainee("Ivan");
        TrainingProgram personalizedProgram = new YogaDecorator(basicProgram);
        fitnessCenter.attach(trainee1, personalizedProgram);

        TrainingProgram strengthProgram = new StrengthTrainingProgram();
        Trainee trainee2 = new Trainee("Sofia");
        TrainingProgram personalizedProgram2 = new SwimmingDecorator(strengthProgram);
        fitnessCenter.attach(trainee2, personalizedProgram2);


        TrainingProgram cardioProgram = new CardioTrainingProgram();
        Trainee trainee3 = new Trainee("Tod");
        TrainingProgram personalizedProgram3 = new RunningDecorator(cardioProgram);
        fitnessCenter.attach(trainee3, personalizedProgram3);

        fitnessCenter.notifyObservers();

        fitnessCenter.setTrainingProgram(trainee1,personalizedProgram3);
    }
}