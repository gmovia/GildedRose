package ar.uba.fi.tdd.exercise.Restriction;

public class RangeRestriction implements Restriction{

    int min;
    int max;

    public RangeRestriction(int min, int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean check(int value){
        return min <= value && value <= max;
    }

}
