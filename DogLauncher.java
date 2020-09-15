/** The DogLauncher class will 'test drive' the Dog class */
public class DogLauncher {

    public static void main(String[] args) {
        Dog d = new Dog(51);

        Dog d2 = new Dog(100);

//        Dog bigger = Dog.maxDog(d, d2);
        Dog bigger = d.maxDog(d2);
        bigger.makeNoise();

        System.out.println(d.binomen);
        System.out.println(d2.binomen);
        /*d.weightInPounds = 50;*/
//        d.makeNoise();
    }
}

/*
Calls a method from another class. Head First Java calls DogLauncher a 'test drive'
 */