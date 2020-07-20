public class WaterBottle {
    private double volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void drink() {
        volume -= 10;
    }

    public void empty() {
        volume = 0;
    }

    public void fill() {
        volume = 100;
    }
}
