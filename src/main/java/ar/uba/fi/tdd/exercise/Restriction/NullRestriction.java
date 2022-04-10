package ar.uba.fi.tdd.exercise.Restriction;

public class NullRestriction implements Restriction{

    @Override
    public boolean check(int value) {
        return true;
    }
}
