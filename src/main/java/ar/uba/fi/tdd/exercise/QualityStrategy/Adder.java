package ar.uba.fi.tdd.exercise.QualityStrategy;

public class Adder implements QualityStrategy{

    int adder;

    public Adder(int adder){
        this.adder = adder;
    }

    @Override
    public int modifyQuality(int quality, int sellIn) {
        return quality + adder;
    }
}
