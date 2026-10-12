public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int baseCarsPerHour = 221;
        double successRate = 0.0;

        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;  // 100% success
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;  // 90% success
        } else if (speed == 9) {
            successRate = 0.8;  // 80% success
        } else if (speed == 10) {
            successRate = 0.77; // 77% success
        }

        return speed * baseCarsPerHour * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) /60);
    }
}
