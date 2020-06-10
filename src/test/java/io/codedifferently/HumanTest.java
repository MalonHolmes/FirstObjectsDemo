package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    
    @Test
    public void constructorTest() {
        // Given
        String first = "Mickey";
        String last = "Mouse";
        int energy = 50;

        // When
        Human testHuman = new Human(first, last);
        String actualFirst = testHuman.getFirst();
        String actualLast = testHuman.getLast();
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }

    @Test
    public void eatTest(){ 
        // Given
        Fruit pineapple = new Fruit("Pineapple", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human("Lonnie","Jackson");

        // When
        testHuman.eat(pineapple);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void worktest(){
        // Given 
        Human testHuman = new Human("Bob", "Le Builder");   
        int expectedEnergy = 30;

        // When 
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest(){
        // Given
        Human testHuman = new Human("Milton", "O'Neil");
        Fruit watermelon = new Fruit("Watermelon", 20);
        Fruit raspberries = new Fruit("Raspberries", 15);
        Fruit orange = new Fruit("Orange", 20);
        Human.maxEnergy = 100;

        // When 
        testHuman.eat(watermelon); // energy: 50 -> 70
        testHuman.eat(orange);     // energy: 70 -> 90
        testHuman.eat(raspberries);// energy: 90 -> 105 (maxes out at 100)

        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(100, actualEnergy);
    }

    @Test
    public void workMinTest() {
        // Given 
        Human testHuman = new Human("Miles", "Morales");

        // When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(50, actualEnergy);

    }

    @Test
    public void maxEnergyChangeTest(){
        // Given
        Human Jharell = new Human("Jharell", "Giles");

        // When
        Human.maxEnergy = 150;

        Fruit watermelon = new Fruit("Watermelon", 20);
        Fruit raspberries = new Fruit("Raspberries", 15);
        Fruit orange = new Fruit("Orange", 20);
        //Fruit apple = new Fruit("Apple", 20);
        //Fruit banana = new Fruit("Banana", 20);
        //Fruit papaya = new Fruit("Papaya", 20);

        Jharell.eat(watermelon);
        Jharell.eat(raspberries);
        Jharell.eat(orange);

        int actualEnergy = Jharell.getEnergy();

        // Then
        Assert.assertEquals(105, actualEnergy);

    }
}