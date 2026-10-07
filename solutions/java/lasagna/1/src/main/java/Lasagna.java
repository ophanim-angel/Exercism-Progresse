public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsed) {
        return 40 - elapsed;
    }

    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }

    public int totalTimeInMinutes(int layer, int minutes) {
        int x = preparationTimeInMinutes(layer);
        return minutes + x;
    }
}
