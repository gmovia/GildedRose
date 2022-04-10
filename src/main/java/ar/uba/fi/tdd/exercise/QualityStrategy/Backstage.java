package ar.uba.fi.tdd.exercise.QualityStrategy;

public class Backstage implements QualityStrategy {

    public int modifyQuality(int quality, int sellIn) {

        quality++;
        if (0 <= sellIn && sellIn <= 10) {
            quality++;
            if (0 <= sellIn && sellIn <= 5) {
                quality++;
                if (sellIn == 0) {
                    return 0;
                }
            }
        }
        return quality;
    }


}
