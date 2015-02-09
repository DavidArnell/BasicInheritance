package example5;

/**
 * Cat inherits everything that Animal has invisibly! However, we must
 * remember of override the speak() method or things won't work as planned!
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Duck implements Animal, Flyable {
    private int age;
    private String name;
    
    public Duck() {
    }

    public Duck(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    // We cannot forget to override these. Inheriting from an Interface is a
    // contractual obligation that forces us
    // to do this. Try commenting out any of these methods and see how you get an
    // error.
    @Override
    public void speak() {
        System.out.println("Quack");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("I'm a Duck and I'm flying");
    }


}
