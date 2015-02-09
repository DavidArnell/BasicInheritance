package example4;

/**
 * Duck inherits everything that Animal has invisibly! However, we must
 * remember of override the speak() method or things won't work as planned!
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Duck extends Animal {

    public Duck() {
    }

    public Duck(int age, String name) {
        super(age, name);
    }
    
    // We cannot forget to do this. Inheriting an abstract method forces us
    // to do this. Try commenting this method out and see how you get an
    // error.
    @Override
    public void speak() {
        System.out.println("Quack");
    }

}
