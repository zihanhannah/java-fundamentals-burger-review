public class Burger implements BurgerSale {
    // properties for bun, pickles, numPatties, Cheese
    private String burgerName;

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    private int numBuns; // 3 for big mac, etc
    private int numPickles;
    private int numPatties;
    private boolean cheese; // true or false

    // constructor
    public Burger(String burgerName, int numberBuns, int numberPickles, int numberPatties, boolean hasCheese) {
        // set each of the local class properties, to the arguments passed into this constructor
        this.burgerName = burgerName;
        this.numBuns = numberBuns;
        this.numPickles = numberPickles;
        numPatties = numberPatties;
        cheese = hasCheese;
    }

    @Override
    public String burgerHasCheese() {
        if (this.cheese) {
            return "This " + this.burgerName + " has cheese.";
        } else {
            return "This " + this.burgerName + " sadly has no cheese.";
        }
    }

    // public Burger(int numBuns, int numPickles, int numPatties, boolean cheese) {
    //     this.numBuns = numBuns;
    //     this.numPickles = numPickles;
    //     this.numPatties = numPatties;
    //     this.cheese = cheese;
    // }

    // ctrl - enter (to get the menu where you can create getters/setters)

    public int getNumBuns() {
        return numBuns;
    }

    public void setNumBuns(int numBuns) {
        this.numBuns = numBuns;
    }

    public int getNumPickles() {
        return numPickles;
    }

    public void setNumPickles(int numPickles) {
        this.numPickles = numPickles;
    }

    public int getNumPatties() {
        return numPatties;
    }

    public void setNumPatties(int numPatties) {
        this.numPatties = numPatties;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }
}