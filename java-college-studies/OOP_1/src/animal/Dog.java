package animal;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(int size, int weight, String name) {
        super(1, 1, size, weight, name);
        setCoat("brown");
        setEyes(2);
        setTail(1);
        setLegs(2);
        setTeeth(65);
    }

    public Dog(int eyes, int legs, int teeth, int tail, String coat, int size, int weight, String name) {
        super(1, 1, size, weight, name);
        setCoat(coat);
        setEyes(eyes);
        setTail(tail);
        setLegs(legs);
        setTeeth(teeth);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTeeth() {
        return teeth;
    }

    public int getTail() {
        return tail;
    }

    public String getCoat() {
        return coat;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }


}
