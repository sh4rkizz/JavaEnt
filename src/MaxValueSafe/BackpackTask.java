package MaxValueSafe;

public class BackpackTask {
    private final int backpackVolume;
    private int backpackValue;

    public BackpackTask(int volume) {
        this.backpackVolume = volume;
        this.backpackValue = 0;
    }

    public int getBackpackValue() {
        return backpackValue;
    }

    public int getVolume() {
        return backpackVolume;
    }

    void fillBackpack(Item[] items, int itemsQuantity, int backpackVolume) {
        int[][] valueTable = new int[itemsQuantity][backpackVolume];

        for (int j = 0; j < backpackVolume; j++) {
            valueTable[0][j] = items[0].getVolume() <= j ? items[0].getValue() : 0;
        }

        for (int i = 1; i < itemsQuantity; i++) {
            for (int j = 0; j < backpackVolume; j++) {
                if (items[i].getVolume() > j) valueTable[i][j] = valueTable[i - 1][j];
                else valueTable[i][j] = Math.max(valueTable[i - 1][j],
                        items[i].getValue() + valueTable[i - 1][j - items[i].getVolume()]);
            }
        }

        backpackValue = valueTable[itemsQuantity-1][backpackVolume-1];
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(1, 100, "money"),
                new Item(2, 150, "charger"),
                new Item(5, 4000, "goldBar"),
                new Item(10, 2000, "laptop"),
                new Item(15, 500000, "emerald"),
                new Item(15, 160, "xylophone"),
                new Item(25, 1000, "guitar"),
                new Item(400, 50000, "car")
        };

        BackpackTask backpack = new BackpackTask(64);
        backpack.fillBackpack(items, items.length, backpack.getVolume());

        System.out.println(backpack.getBackpackValue());
    }
}