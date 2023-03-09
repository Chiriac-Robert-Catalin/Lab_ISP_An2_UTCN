package isp.lab8.carparkaccess;

import java.io.Serializable;

public class DetailsCar  implements Serializable {
    private Car car;
    private long cost;

    public DetailsCar(Car car, long cost){
        this.car = car;
        this.cost = cost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "DetailsCar{" +
                "car " + car.toString() +
                ", cost=" + cost +
                '}';
    }
}
