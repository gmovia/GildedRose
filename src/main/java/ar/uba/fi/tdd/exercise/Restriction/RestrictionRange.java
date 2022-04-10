package ar.uba.fi.tdd.exercise.Restriction;

public class RestrictionRange implements Restriction{

    int min;
    int max;

    public RestrictionRange(int min, int max){
        this.min = min;
        this.max = max;
    }

    public boolean check(int value){
        return min <= value && value <= max;
    }

}
