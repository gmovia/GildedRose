package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Restriction.Restriction;

public class Constant implements QualityStrategy {

    int constant;

    public Constant(int constant){
        this.constant = constant;
    }

    public int modifyQuality(int quality, int sellIn, Restriction restriction){
        return constant;
    }
}
