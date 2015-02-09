package basicinheritance;

import example1and3.Animal;
import example1and3.Cat;
import example1and3.Dog;

/**
 * In this example we will show how to use objects based on simple, 
 * concrete inheritance. The problem with concrete inheritance is that
 * super classes (parents) may be instantiated, which would be unwise because
 * those objects are too generic to be useful. Also, with concrete inheritance
 * you may inherit badly implemented methods.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Example1Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Notice we CAN do this, which would be unwise. See example 4
        // for a better way.
//        Animal animal = new Animal();
        
        // First, we just create a Dog instance and call its methods...
        Dog dog1 = new Dog();
        
        // all animals can do this...
        dog1.setAge(5);
        dog1.setName("Fido");
        System.out.print("Dog 1 says: ");
        dog1.speak();
        
        // only dogs can do this...
        String item = dog1.fetch();
        System.out.println("Dog 1: " + dog1.getName() 
                + ", age: " + dog1.getAge() 
                + ", rabbies ID: " + dog1.getRabbiesId()
                + ", fetched: " + item);
        
        // Next, create a Cat...
        Cat cat = new Cat(3,"Mitsy");
        
        // all animals can do this...
        cat.setAge(2); // mutate the age
        cat.setName("Garfield"); // mutate the name
        System.out.print("Cat says: ");
        cat.speak();
        
        // but cats can't fetch or access rabbiesId info. Cats don't behave
        // like Dogs, but they do behave like Animals...
        System.out.println("Cat: " + cat.getName() 
                + ", age: " + cat.getAge());
        
        
        // Now what happens when we choose to treat a Dog, which has special
        // capabilities, just like an ordinary Animal...
        
        // Well then, we can do animal things like these...
        Animal dog2 = new Dog();
        dog2.setAge(3);
        dog2.setName("Max");
        System.out.print("Dog 2 says: ");
        dog2.speak();
        System.out.println("Dog 2: " + dog2.getName() 
                + ", age: " + dog2.getAge());
        
        // But we CANNOT do Dog things like these because we aren't treating
        // the objects as Dog objects, just as Animal objects. Try
        // removing the comments and notice the errors.
        
        // dog2.fetch();
        // dog2.setRabbiesId("11234");
        
        // Try adding a Duck on your own...
    }
}
