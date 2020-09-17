import java.util.HashMap;
import model.Burger;

public class Assessment {
    // Have a Burger Class - properties of condiments - print out a statement about deliciousness factor

    public static void main(String[] args) {
        // test making a burger
        Burger bigMac = new Burger("Big Mac", 3, 7, 2, true);

        System.out.println(bigMac.getNumPickles());
        System.out.println(bigMac.burgerHasCheese());

        Burger homestyle = new Burger("Homestyle", 2, 3, 1, false);
        System.out.println(homestyle.burgerHasCheese());

        System.out.println("The area of a rectangle with side 1: 5, and side 2: 7 is equal to: " + getArea(5, 7));
        // Make a hash map of burgers where the key => value relationship is 'burgerName' => Burger()
        HashMap<String, Burger> theBurgers = new HashMap<>();
        theBurgers.put(bigMac.getBurgerName(), bigMac);
        theBurgers.put(homestyle.getBurgerName(), homestyle);

        // Here is a visual representation of what's IN the hash map
        // [
        //     'Big Mac': Burger('Big Mac', 3, 7, 2, true),
        //     'Homestyle': Burger('Homestyle', 2, 3, 1, false)
        // ]

        // try to get the Hashmap item at index 'Big Mac' and see how many buns that element (Burger) has
        System.out.println("The " + theBurgers.get("Big Mac").getBurgerName() + " has " + theBurgers.get("Big Mac").getNumBuns() + " buns.");

        // loop through all burgers, and print how many buns they have
        for( String key : theBurgers.keySet() ) {
            // Once we are here, we know what the individual key is
            System.out.println("The " + theBurgers.get(key).getBurgerName() + " has " + theBurgers.get(key).getNumBuns() + " buns.");

        }

    }

    // write a method that finds the area of a rectangle, based on 2 sides that are passed in as arguments
    public static double getArea(double sideOne, double sideTwo) {
        // If we don't declare this method as 'static', we won't be able to access it within the 'static' context of our psvm.
        // By declaring public static double ... , we are able to access this method, from within the static context of psvm
        return sideOne * sideTwo;
    }
}
