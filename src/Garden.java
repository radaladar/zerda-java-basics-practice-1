import java.util.ArrayList;
/**
 * Created by BB on 2016-11-21.
 */
public class Garden {
   private ArrayList<Plant> garden = new ArrayList<Plant>(1);

    public Garden() {
        this.garden = garden;
    }

    public void plantFlower(String color) {
        garden.add(new Flower(color));
    }

    public void plantTree(String color) {
        garden.add(new Tree(color));
    }
    public void water(int i) {
        System.out.printf("Watering with %d\n", i);
        int counter = 0;
        for (Plant p: this.garden) {
            p.checkWater();
            if (p.needsWater()) {
                counter++;
            }
        }
        for (Plant p : this.garden) {
            if (p.needsWater()) {
                p.absorb(i/counter);
            }
        }
    }

    public String toString() {
        String gardenOut = "";
        for (Plant p : this.garden) {
            String type = "";
            String need = "doesn't need";
            if (p instanceof Flower) {
                type = "flower";
            } else if (p instanceof Tree) {
                type = "tree";
            }
            if (p.needsWater()) {
                need = "needs";
            }
            gardenOut += "The "+ p.getColor() + " "+ type + " " + need + " water\n";
        }
        return gardenOut;
    }

}
