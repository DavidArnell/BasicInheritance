package example2;

/**
 * Cat inherits inherits nothing -- no super class.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Cat {
    // Since we are not using inheritance, all of our animal classes must
    // duplicate these properities. What if different authors use different
    // terminology?
    private int age;
    private String name;
    
    public Cat() {
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }


    // Since we are not using inheritance, all of our animal classes must
    // duplicate these methods. What if different authors use different
    // terminology?

    public void speak() {
        System.out.println("Meow");
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
