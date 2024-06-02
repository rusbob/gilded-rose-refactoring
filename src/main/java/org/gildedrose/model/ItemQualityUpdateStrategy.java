package org.gildedrose.model;

public interface ItemQualityUpdateStrategy {

    int MAX_QUALITY = 50;
    int MIN_QUALITY = 0;

    void updateQuality(Item item);

    default void decreaseQuality(Item item) {
        if (item == null) {
            return;
        }

        if (item.quality > MIN_QUALITY) {
            item.quality--;
        }
    }

    default void increaseQuality(Item item) {
        if (item == null) {
            return;
        }

        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }
}
