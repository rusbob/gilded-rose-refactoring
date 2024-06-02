package org.gildedrose.model;

public enum ItemNameEnum {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    CONJURED("Conjured"),
    UNRECOGNIZED_ITEM("Unrecognized Item");

    public final String name;

    ItemNameEnum(String name) {
        this.name = name;
    }

    public static ItemNameEnum fromString(String name) {
        for (ItemNameEnum itemNameEnum : ItemNameEnum.values()) {
            if (itemNameEnum.name.equalsIgnoreCase(name)) {
                return itemNameEnum;
            }
        }
        return ItemNameEnum.UNRECOGNIZED_ITEM;
    }

    public String getValue() {
        return name;
    }
}
