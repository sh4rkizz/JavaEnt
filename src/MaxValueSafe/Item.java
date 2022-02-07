package MaxValueSafe;

public class Item {
    private int volume, value;
    private String name;

    public Item(int vol, int val, String name) {
        this.volume = vol;
        this.value = val;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
