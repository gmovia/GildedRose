package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Restriction.Restriction;

public class Adder implements QualityStrategy{

    int adder;

    public Adder(int adder){
        this.adder = adder;
    }

    @Override
    public int modifyQuality(int quality, int sellIn, Restriction restriction) {
        if (restriction.check(quality)) {
            return quality + adder;
        }
        return quality;
    }
}
