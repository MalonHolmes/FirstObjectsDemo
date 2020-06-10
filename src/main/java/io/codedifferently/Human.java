package io.codedifferently; //declaring the package the Human class resides in 

public class Human {
    
    // Properties of our Human
    private String firstName;
    private String lastName;
    private int energy;
    static int maxEnergy = 100;

    // Constructor
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;
    }

    // Functionality for our Human
    public void eat(Fruit fruit) {
        if(this.energy + fruit.getEnergy() <= maxEnergy){
            this.energy = this.energy + fruit.getEnergy();
        } else {
            this.energy = maxEnergy;
            System.out.println("Imma keep it a hunned...100!!");
        }
    }

    public void work(int hours){
        int energySpent = hours * 10;

        if(this.energy - energySpent < 0){
            System.out.println("Too lazy lol...will do it later after I eat something");
        } else {
            System.out.println("Yeah, sure I'm down...");
            this.energy = this.energy - energySpent;
        }

    }

    // Accessor Methods
    public int getEnergy(){
        return this.energy;
    }

    public String getFirst(){
        return this.firstName;
    }

    public String getLast(){
        return this.lastName;
    }
}