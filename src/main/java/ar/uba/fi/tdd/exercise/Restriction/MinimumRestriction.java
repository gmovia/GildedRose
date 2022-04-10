package ar.uba.fi.tdd.exercise.Restriction;

public class MinimumRestriction implements Restriction{

    int min;

    public MinimumRestriction(int min){
        this.min = min;
    }

    @Override
    public boolean check(int value){
        return min <= value;
    }
}
