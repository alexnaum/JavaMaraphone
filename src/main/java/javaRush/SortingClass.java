package javaRush;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingClass {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        //System.out.println(cars.get(0).getManufactureYear());
        cars.add(bugatti);
        cars.add(lambo);

        //тут раньше была ошибка
        Collections.sort(cars);
        for(int i=0;i<cars.size();i++)
        System.out.println(cars.get(i).getManufactureYear());
    }
}
class Car implements Comparable<Car> {

    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public int getManufactureYear(){
        return manufactureYear;
    }
    public String getModel(){
        return model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    @Override
    public int compareTo(Car o) {
        //return 0;
        return this.getManufactureYear() - o.getManufactureYear();
    }

    //...геттеры, сеттеры, toString()

}
