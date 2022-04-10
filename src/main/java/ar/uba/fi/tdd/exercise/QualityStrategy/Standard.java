package ar.uba.fi.tdd.exercise.QualityStrategy;

public class Standard implements QualityStrategy {

    public int modifyQuality(int quality, int sellIn) {
        if (sellIn > 0) {
            return quality - 1;
        }
        return quality - 2;
    }

}
