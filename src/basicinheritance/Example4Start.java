package basicinheritance;

import example4.*;

/**
 * This demo is exactly the same as example 1, except that it uses the
 * abstract super class Animal. This means that Animal cannot be instantiated,
 * and that any abstract methods must be re-declared in the subclasses. Other
 * than that, functionality is the same.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Example4Start {
    public static void main(String[] args) {
        
        // Notice we CANNOT do this, which would be unwise anyway. Abstract
        // classes may not be instantiated. Now we have more control over
        // how Animal is used.
//        Animal animal = new Animal();
        
        // Let's begin by creating an array based on the data type of the
        // parent class. That way, each of these objects temporarily morphs
        // into a plain, generic Animal, and benefits from common behavior..
        Animal[] animals = {
            new Dog(5,"Fido"), 
            new Cat(8,"Sassy")
                
            // Now if you remove an object from this array, or add some
            // (try uncommenting the next two lines) nothing breaks!
//            ,
//            new Duck(4,"Donald")
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
//        }        
    }
}
