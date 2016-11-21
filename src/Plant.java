/**
 * Created by BB on 2016-11-21.
 */
public abstract class Plant {
    private String color;
    private double currentWater;
    private double minWater;
    private boolean needsWater;
    private double absorbRate;

    Plant(String color, double minWater, double absorbRate) {
        this.color = color;
        this.currentWater = 0;
        this.minWater = minWater;
        this.needsWater = true;
        this.absorbRate = absorbRate;
    }

    public void checkWater() {
        if (this.currentWater < this.minWater) {
            this.needsWater = true;
        } else {
            this.needsWater = false;
        }
    }

    public void absorb(int water) {
        this.currentWater = water * this.absorbRate;
        this.checkWater();
    }

    public String getColor() {
        return this.color;
    }

    public boolean needsWater() {
        return this.needsWater;
    }

    public double getCurrentWater() {
        return this.currentWater;
    }
}
