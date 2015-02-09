package example5;

/**
 * Notice that this class doesn't belong to the Animal class hierarchy, but
 * it can share one if the interfaces used there. That's because Interfaces
 * are the only data type that can be generic in that they can belong to any
 * appropriate class hierarchy. It's not an "is a" relationship. It's a 
 * "plays the role of" relationship.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm an airplane and I'm flying");
    }
    
}
