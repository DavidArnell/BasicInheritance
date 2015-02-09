package basicinheritance;

import example2.*;

/**
 * In this demo we will show a naive example that does not use inheritance
 * and, does not use polymorphism. The result is overly complex and fragile
 * code that leads to quality problems.
 * 
 * @author      Jim Lombardo
 * @version     1.00
 */
public class Example2Start {
    public static void main(String[] args) {
        
        // Let's begin by creating an array of animal objects. The only
        // super class we have is the Object class. We need this to create
        // the array...
        Object[] animals = {
            new Dog(5,"Fido"), 
            new Cat(8,"Sassy")
                
            // What happens to the loop below if we add another animal?
            // Try uncommenting the following two lines and see.
            ,
            new Duck(4,"Donald")
        };
        
        
        // This loop and if logic is fragile and is going to break if you do
        // certain things like remove an animal from the array. Also if you
        // add an animal you must modify the if logic. Furthermore, you must
        // keep track of all proeprty and method names because they are not
        // consistent from class to class. Different authors may use different
        // terms. All of this makes this code more complex than necessary and
        // easy to make mistakes. Plus certain types of change will break
        // this code. See how we solve this problem in "Example3Start"
        for(int i=0; i < animals.length; i++) {
            if(animals[i] instanceof Dog) {
                System.out.println(
                    ((Dog)animals[i]).getName()
                );
                System.out.println(
                    ((Dog)animals[i]).getAge()
                );
                ((Dog)animals[i]).speak();
                ((Dog)animals[i]).fetch();
                
            } else if(animals[i] instanceof Cat) {
                System.out.println(
                    ((Cat)animals[i]).getName()
                );
                System.out.println(
                    ((Cat)animals[i]).getAge()
                );
                ((Cat)animals[i]).speak();
            } 
            
            // if you add an animal to the array above, you must modify
            // this loop and if logic...
//            else if(animals[i] instanceof Duck) {
//                System.out.println(
//                    ((Duck)animals[i]).getName()
//                );
//                // Notice the different terms for age and speak
//                System.out.println(
//                    ((Duck)animals[i]).getTheAge()
//                );               
//                ((Duck)animals[i]).quack();
//            }
        }
        
    }
}
