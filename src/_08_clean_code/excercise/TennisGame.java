package _08_clean_code.excercise;

public class TennisGame {
    public static String getScore( int score1, int score2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (score1 == score2) {
            score = getStringBuilder(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            score = getStringBuilder(score1, score2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = score1;
                else {
                    score.append("-");
                    tempScore = score2;
                }

            }
        }
        return score.toString();
    }

    private static StringBuilder getStringBuilder(int score1) {
        StringBuilder score;
        switch (score1) {
            case 0:
                score = new StringBuilder("Love-All");
                break;
            case 1:
                score = new StringBuilder("Fifteen-All");
                break;
            case 2:
                score = new StringBuilder("Thirty-All");
                break;
            case 3:
                score = new StringBuilder("Forty-All");
                break;
            default:
                score = new StringBuilder("Deuce");
                break;

        }
        return score;
    }

    private static StringBuilder getStringBuilder(int score1, int score2) {
        StringBuilder score;
        int minusResult = score1 - score2;
        if (minusResult == 1) score = new StringBuilder("Advantage player1");
        else if (minusResult == -1) score = new StringBuilder("Advantage player2");
        else if (minusResult >= 2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }
}
