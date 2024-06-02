package org.gildedrose.model;

public class SulfureItemUpdateStrategy implements ItemQualityUpdateStrategy {

    @Override
    public void updateQuality(Item item) {
        // Sulfuras never has to be sold or decreases in Quality
    }
}
