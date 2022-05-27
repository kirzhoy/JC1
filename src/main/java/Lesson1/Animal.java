package Lesson1;

public class Animal {
    private String name;
    private String suitColor;

    public Animal(String name, String suitColor) {
        this.name = name;
        this.suitColor = suitColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuitColor() {
        return suitColor;
    }

    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", suitColor='" + suitColor + '\'' +
                '}';
    }
}
