package example5;

/**
 * This parent class is called an Interface . It is a pure abstraction
 * because it may only have abstract methods and public static constants. Just
 * like an abstract class it CANNOT 
 * be instantiated, which probably is a good idea. After all, what use is
 * there for an Animal object? What we really need is something more specific,
 * say a Cat or Dog object.
 * <p>
 * The thing to pay attention to is that most everything works exactly the
 * same as in examples 1 and 3, except that now you must redeclare and 
 * implement all of these methods -- no option to do otherwise!
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public interface Animal {
    public abstract void speak();
    
    public abstract int getAge();

    public abstract void setAge(int age);

    public abstract String getName();

    public abstract void setName(String name);
}
