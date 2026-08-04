package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

    public static void printAnimalList(List<? extends Animal> list) { //Producer extends

        for (Animal an : list) {
            System.out.println(an.getClass().getName());
        }
//        list.add(new Animal());
//        list.add(new Dog());   //Adding is not allowed because if I add Dog all indexes should point to dog , i cant add Cat then as a reference of Dog cannot hold a Cat

        Animal an = list.get(0);
    }

    public static void addAnimal(List<? super Animal> list)  //Consumer super
    {
//        Animal an = list.get(0);  //Not allowed because may pass a list of object which cannot be captured in Animal
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Animal());
    }
    public static void printAnimalArray(Animal[] animals)
    {
        for(Animal animal : animals)
        {
            System.out.println(animal.getClass().getName());
        }
        animals[6] = new Cat();

    }
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

//        printAnimalList(dogs);   // List is invariant

        Dog[] dogs2 = new Dog[10];
//        printAnimalArray(dogs2);  // Arrays are covariant

        List<Object> objs = new ArrayList<>();
        objs.add(10);
        addAnimal(objs);
    }
}
