package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Restriction.Restriction;

public class Adder implements QualityStrategy{

    int adder;
    Restriction restriction;

    public Adder(int adder, Restriction restriction){
        this.adder = adder;
        this.restriction = restriction;
    }

    @Override
    public int modifyQuality(int quality, int sellIn) {
        if (restriction.check(quality)) {
            return quality + adder;
        }
        return quality;
    }
}
