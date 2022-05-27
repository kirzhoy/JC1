package Lesson1;

public class Snake extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Snake(String name, String suitColor, double swimmingSpeed) {
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
        //System.out.println("Я змея, я плыву");
        double timeToOvercome = pool.getLength() / swimmingSpeed; //время проплывания бассейна = длина / на скорость
        System.out.println(getName() + " преодолел за " + timeToOvercome);
        return timeToOvercome;
    }
}

   /* public double swim(Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
        */