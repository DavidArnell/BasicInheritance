package basicinheritance;

import example5.Airplane;
import example5.Animal;
import example5.Cat;
import example5.Dog;
import example5.Duck;
import example5.Flyable;

public class Example5Start {
    public static void main(String[] args) {
        
        Animal[] animals = {
            new Dog(5,"Fido"), 
            new Cat(8,"Sassy")
        };
        
        
        // No matter how you modify the contents of the array above, you
        // never have to edit this code. It cannot break because we are 
        // only using commen behaviors. Furthermore, unlike example 2, we
        // do not have to worry about inconsistent naming of properties
        // or methods because inherited members are guaranteed to be
        // consistent! And did you notice we no longer need if logic?
        for(Animal a : animals) {
            a.speak();
        }
        
        // Of course, if we try to use methods that are unique to a subclass
        // of Animal, then our code is no longer polymrophic...
//        for(Animal a : animals) {
//            a.speak();
//            a.fetch(); // causes error -- not part of Animal definition!
                         // would have to cast to a Dog to get this to work,
                         // which would break polymorphism
//        }      
        
        // What if we only want to target Flyables?
        Flyable[] flyables = new Flyable[2];
        flyables[0] = new Airplane();
        flyables[1] = new Duck();
        
        // This for loop is polymorphic with respect to the fly() method. But
        // we cannot use any of the methods of the other Interface or classes.
        for(Flyable f : flyables) {
            f.fly();
        }
    }
}
