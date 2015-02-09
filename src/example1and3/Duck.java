package example1and3;

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
    
    // What if we forget to do this?
//    @Override
//    public void speak() {
//        System.out.println("Quack");
//    }

}
