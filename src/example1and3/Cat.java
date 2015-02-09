package example1and3;

/**
 * Cat inherits everything that Animal has invisibly! However, we must
 * remember of override the speak() method or things won't work as planned!
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }
    
    // What if we forget to do this. Try commenting this method out and 
    // run the program
    
    @Override
    public void speak() {
        System.out.println("Meow");
    }

}
