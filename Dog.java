public class Dog {
    /** Instance variable, can have as many of these as you want */
    public int weightInPounds;
    public static String binomen = "Canis familiaris";
    /** One integer constructor for dogs, determines how to instantiate the class */
    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }
}


/*
Can't be run directly, since there is no main method
 */

/*
An object in Java is an instance of any class
The Dog class has its own variables, also known as
instance variables or non-static variables
These must be declared inside the class, unlike Python,
where new variables cna be added at runtime
 */

/*
A class may have a mix of static and non-static members
1. A variable of method defined in a class is also called a member of that class
2. Static members are accessed using class name, e.g. Dog.binomen
3. Non-static members cannot be invoked using class name, Dog.makeNoise() won't work
4. Static methods must access instance variables via a specific instance, e.g. d1
 */