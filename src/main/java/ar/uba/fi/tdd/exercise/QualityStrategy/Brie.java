package ar.uba.fi.tdd.exercise.QualityStrategy;

public class Brie implements QualityStrategy {

    public int modifyQuality(int quality, int sellIn){
        return quality+1;
    }
}
