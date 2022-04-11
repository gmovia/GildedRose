package ar.uba.fi.tdd.exercise.Item;

public class Item {

    //name
    public String name;

    // seell in
    public int sellIn;

    //
    public int quality;

    // constructor
    public Item(String _name, int _sellIn, int _quality) {
        this.name = _name;
        this.sellIn = _sellIn;
        this.quality = _quality;
    }

    // shows the Item representation
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
