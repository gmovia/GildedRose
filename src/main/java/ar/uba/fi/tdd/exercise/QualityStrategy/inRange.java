package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Restriction.Restriction;

public class inRange implements QualityStrategy{

    private int max;
    private int adder;
    private Restriction restriction;
    private QualityStrategy strategy;

    public inRange(int adder, int max, Restriction restriction, QualityStrategy strategy){
        this.adder = adder;
        this.max = max;
        this.restriction = restriction;
        this.strategy = strategy;
    }

    @Override
    public int modifyQuality(int quality, int sellIn) {
        if(restriction.check(quality)) {
            quality = quality + adder;
            if (sellIn <= max) {
                return strategy.modifyQuality(quality, sellIn);
            }
        }
        return quality;
    }
}
