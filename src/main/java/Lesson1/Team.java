package Lesson1;

import java.util.Arrays;

public class Team {

     public static void main(String[] args) {

        Cat cat = new Cat("Васька", "Белый", 15);
        Dog dog = new Dog("Бобик", "Коричневый",20);
        Leo leo = new Leo("Лео", "Рыжий",25);
        Snake snake = new Snake("Каа", "Серый", 30);
        CanSwim[] team = new CanSwim[] {cat, dog,leo,snake};

        Pool pool1 = new Pool(30);
        Pool pool2 = new Pool(40);
        Pool pool3 = new Pool(100);
        Pool[] pools = new Pool[] {pool1,pool2,pool3};

        for (Pool a: pools){
            System.out.println("      ");
            System.out.println( a );
            System.out.println("      ");
           for (CanSwim canSwim : team ){
                canSwim.swim(a);
               }
        }
       }

}
