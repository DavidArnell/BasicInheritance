package example2;

/**
 * Dog inherits nothing -- no super class.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Dog {
    // Since we are not using inheritance, all of our animal classes must
    // duplicate these properities. What if different authors use different
    // terminology?
    private int age;
    private String name;
    // Unique to Dog    
    private String rabbiesId;

    public Dog() {
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
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
    
    // Since we are not using inheritance, all of our animal classes must
    // duplicate these methods. What if different authors use different
    // terminology?

    public void speak() {
        System.out.println("Bark");
    }    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
