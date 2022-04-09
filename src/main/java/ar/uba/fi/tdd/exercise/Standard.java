package ar.uba.fi.tdd.exercise;

public class Standard implements QualityStrategy {

    public int modifyQuality(int quality, int sellIn) {
        if (sellIn > 1) {
            return quality - 1;
        }
        return quality - 2;
    }

}
