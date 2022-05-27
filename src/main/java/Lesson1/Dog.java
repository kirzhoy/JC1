package Lesson1;

public class Dog extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Dog(String name, String suitColor,double swimmingSpeed) {
        super(name, suitColor);
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(Pool pool) {
        double timeToOvercome = pool.getLength() / swimmingSpeed; //время проплывания бассейна = длина / на скорость
        System.out.println(getName() + " преодолел за " + timeToOvercome);
        //System.out.println(timeToOvercome);
        return timeToOvercome;
    }
}
