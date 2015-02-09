package example2;

/**
 * Duck inherits nothing -- no super class
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Duck {
    // Since we are not using inheritance, all of our animal classes must
    // duplicate these properities. What if different authors use different
    // terminology?
    private int theAge;
    private String name;
    
    public Duck() {
    }

    public Duck(int age, String name) {
        this.theAge = age;
        this.name = name;
    }

    // Since we are not using inheritance, all of our animal classes must
    // duplicate these methods. What if different authors use different
    // terminology?
    
    public void quack() {
        System.out.println("Quack");
    }
    
    public int getTheAge() {
        return theAge;
    }

    public void setTheAge(int theAge) {
        this.theAge = theAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
