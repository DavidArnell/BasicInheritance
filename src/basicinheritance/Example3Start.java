package basicinheritance;

import example1and3.Animal;
import example1and3.Cat;
import example1and3.Dog;
import example1and3.Duck;

/**
 * Polymorphism is one of the most powerful features of Object-oriented
 * languages. The word is composed of two parts:
 *      "Poly" -- meaning many, and
 *      "Morph" -- meaning to change into something else, temporarily
 * <p>
 * In this demo we will return to the use of inheritance and show how treating 
 * many objects (poly) in a new way (morph) allows for some powerful 
 * capability and improved quality.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Example3Start {
    public static void main(String[] args) {
        
        // Let's begin by creating an array based on the data type of the
        // parent class. That way, each of these objects temporarily morphs
        // into a plain, generic Animal, and benefits from common behavior..
        Animal[] animals = {
            new Dog(5,"Fido"), 
            new Cat(8,"Sassy")
                
            // Now if you remove an object from this array, or add some
            // (try uncommenting the next two lines) nothing breaks!
            ,
            new Duck(4,"Donald")
        };
        
        
        // No matter how you modify the contents of the array above, you
        // never have to edit this code. It cannot break because we are 
        // only using commen behaviors. Furthermore, unlike example 2, we
        // do not have to worry about inconsistent naming of properties
        // or methods because inherited members are guaranteed to be
        // consistent! And did you notice we no longer need if logic?
        for(int i=0; i < animals.length; i++) {
            animals[i].speak();
        }
        
        
        for(Animal a : animals) {
            if(a instanceof Dog) {
                ((Dog)a).speak();
            } else {
                ((Cat)a).speak();
            }
        }
        
        // Of course, if we try to use methods that are unique to a subclass
        // of Animal, then our code is no longer polymrophic...
//        for(Animal a : animals) {
//            a.speak();
//            a.fetch(); // causes error -- not part of Animal definition!
//        }        
    }
}
