package example1and3;

/**
 * This parent class is concrete -- meaning it is a normal class with
 * fully implemented methods (methods with a body, as opposed to abstract
 * methods without a body). Because it is a normal class it can be 
 * instantiated, which probably isn't a good idea. After all, what use is
 * there for an Animal object? What we really need is something more specific,
 * say a Cat or Dog object. But still, this is legal.
 * <p>
 * The thing to pay attention to is that the properties and methods represent
 * things that are shared by all Animal subclasses. Therfore, we inherit them
 * for free, which is to say we don't need to enter any of this code in our
 * subclasses, making us more productive. However, you must be careful. Note
 * how the speak method has a default behavior, which should be changed
 * (overridden) in the subclasses. What if you forget to do this?
 * <p>
 * Finally, notice this JavaDoc comment. Your code should have similar,
 * verbose descriptions.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Animal {
    // Common properties to all subclasses
    private int age;
    private String name;

    // Two constructors, for convenience...
    
    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    /**
     * This method should be overridden in all subclasses. Will you remember
     * to do this? What could you do to prevent the possibility that developers
     * will forget?
     */
    public void speak() {
        System.out.println("mute");
    }

    // Just some necessary accessors and mutators for our properties...
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 15) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // validation needed for name
        this.name = name;
    }
    
    
}
