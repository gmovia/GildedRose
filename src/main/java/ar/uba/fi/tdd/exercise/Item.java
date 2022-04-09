package ar.uba.fi.tdd.exercise;

public class Item {

    private String name;
    private int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    // for test
    public int getSellIn(){
        return sellIn;
    }

    // for test
    public int getQuality(){
        return quality;
    }

    public void updateQuality(){
        sellIn --;
        if(sellIn < 1){
            quality = quality - 2;
        }
        else{
            quality = quality - 1;
        }
    }
 }
