package ar.uba.fi.tdd.exercise.QualityStrategy;

public class Constant implements QualityStrategy {

    int constant;

    public Constant(int constant){
        this.constant = constant;
    }

    public int modifyQuality(int quality, int sellIn){
        return constant;
    }
}
