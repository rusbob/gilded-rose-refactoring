package org.gildedrose.model;

public class RegularItemUpdateStrategy implements ItemQualityUpdateStrategy {
    @Override
    public void updateQuality(Item item) {
        decreaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }
}
