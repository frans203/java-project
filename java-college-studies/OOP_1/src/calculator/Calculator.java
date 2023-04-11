package calculator;

import Floor.Floor;
import carpet.Carpet;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }

}
