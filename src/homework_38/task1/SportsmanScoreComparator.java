package homework_38.task1;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        return sportsman2.getScore() - sportsman1.getScore();
    }
}
