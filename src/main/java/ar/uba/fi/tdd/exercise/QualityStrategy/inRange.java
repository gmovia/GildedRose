package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Restriction.Restriction;

public class inRange implements QualityStrategy{

    int max;
    int adder;
    QualityStrategy strategy;

    public inRange(int adder, int max, QualityStrategy strategy){
        this.adder = adder;
        this.max = max;
        this.strategy = strategy;
    }

    @Override
    public int modifyQuality(int quality, int sellIn, Restriction restriction) {
        if(restriction.check(quality)) {
            quality = quality + adder;
            if (sellIn <= max) {
                return strategy.modifyQuality(quality, sellIn, restriction);
            }
        }
        return quality;
    }
}
