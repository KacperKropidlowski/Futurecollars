package Task7;

public class TrainingScore {
    public static String getTrainingScore(double minutes, double calories, double pulse) {
        double timeScore;
        double timeScoreWeight = 1;
        double caloriesScore;
        double caloriesScoreWeight = 2;
        double pulseScore;
        double pulseScoreWeight = 3;
        String trainingEfficiency;

        if (minutes < 30) {
            timeScore = 1;
        } else if (minutes >= 30 && minutes < 60) {
            timeScore = 2;
        } else {
            timeScore = 3;
        }
        if (calories <= 300) {
            caloriesScore = 1;
        } else if (calories > 300 && calories < 400) {
            caloriesScore = 2;
        } else {
            caloriesScore = 3;
        }
        if (pulse < 160) {
            pulseScore = 3;
        } else if (pulse <175) {
            pulseScore = 2;
        } else {
            pulseScore = 1;
        }

        double trainingScore = (timeScore * timeScoreWeight + caloriesScore * caloriesScoreWeight + pulseScore * pulseScoreWeight) / (timeScoreWeight + caloriesScoreWeight + pulseScoreWeight);
        if (trainingScore < 1.2) {
            trainingEfficiency = "Low training efficiency\nYour training score: " + trainingScore;
        } else if (trainingScore < 2) {
            trainingEfficiency = "Good training efficiency\nYour training score: " + trainingScore;
        } else if (trainingScore < 3) {
            trainingEfficiency = "Very good training efficiency\nYour training score: " + trainingScore;
        } else {
            trainingEfficiency = "Perfect training efficiency\nYour training score: " + trainingScore;
        }
        return trainingEfficiency;
    }
}
