/**
 * Created by BB on 2016-11-21.
 */
public class GardenApp {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.plantFlower("yellow");
        garden.plantFlower("blue");
        garden.plantTree("purple");
        garden.plantTree("orange");

        System.out.println(garden.toString());

        garden.water(40);
        System.out.println(garden.toString());

        garden.water(70);
        System.out.println(garden.toString());
    }
}
