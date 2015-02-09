package example4;

/**
 * This parent class is called an abstract class, but it really just a
 * partial abstraction because it's really a hybrid of features of both
 * Interfaces and Concrete classes -- meaning it is NOT a normal class. It has
 * (optionally) a combination of concrete methods (methods with a body) and
 * abstract methods (methods without a body). Because it is abstract it CANNOT 
 * be instantiated, which probably is a good idea. After all, what use is
 * there for an Animal object? What we really need is something more specific,
 * say a Cat or Dog object.
 * <p>
 * The thing to pay attention to is that most everything works exactly the
 * same as in examples 1 and 3, except that now it is impossible to forget
 * to override speak(). The fact that speak() is declared abstract means that
 * all subclasses MUST override this method -- no option to do otherwise!
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public abstract class Animal {
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
     * This abstract method MUST be overridden in all subclasses. Notice that 
     * an abstract method has no body (implementation).
     */
    public abstract void speak();

    // Just some necessary accessors and mutators for our properties...
    
    public int getAge() {
        return age;
    }
    

    public void setAge(int age) {
         //validation needed for age
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
