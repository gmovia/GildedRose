package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Restriction.NullRestriction;
import ar.uba.fi.tdd.exercise.Restriction.Restriction;

public class Constant implements QualityStrategy {

    private int constant;

    public Constant(int constant){
        this.constant = constant;
    }

    public int modifyQuality(int quality, int sellIn){
        return constant;
    }
}
