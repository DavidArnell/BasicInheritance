package example4;

/**
 * Dog inherits everything that Animal has invisibly! However, we must
 * remember of override the speak() method or things won't work as planned!
 * <p>
 * Also, note that we've added a unique property -- rabbiesId, plus
 * a unique method -- fetch() -- to this class.
 * Only the Dog class has these members. So the definition of Animal has
 * been extended by our Dog definition, but this extended definition only
 * applies to Dog.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Dog extends Animal {
    // Unique to Dog    
    private String rabbiesId;

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }
    
    // We cannot forget to do this. Inheriting an abstract method forces us
    // to do this. Try commenting this method out and see how you get an
    // error.
    @Override
    public void speak() {
        System.out.println("Bark");
    }

    
    // Unique to Dog...
    
    public String fetch() {
        return "paper";
    }

    public String getRabbiesId() {
        return rabbiesId;
    }

    public void setRabbiesId(String rabbiesId) {
        this.rabbiesId = rabbiesId;
    }
    
    
}
