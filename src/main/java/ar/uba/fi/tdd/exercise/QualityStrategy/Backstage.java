package ar.uba.fi.tdd.exercise.QualityStrategy;

public class Backstage implements QualityStrategy {

    public int modifyQuality(int quality, int sellIn) {

        if (5 < sellIn && sellIn <= 10) {
            return quality + 2;
        }

        if (0 < sellIn && sellIn <= 5) {
            return quality + 3;
        }

        if (sellIn == 0) {
            return 0;
        }

        return quality;
    }

}
