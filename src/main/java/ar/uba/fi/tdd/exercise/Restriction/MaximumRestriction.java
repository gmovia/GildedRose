package ar.uba.fi.tdd.exercise.Restriction;

public class MaximumRestriction implements Restriction{

    int max;

    public MaximumRestriction(int max){
        this.max = max;
    }

    @Override
    public boolean check(int value){
        return value <= max;
    }
}
