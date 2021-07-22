package com.zipcodewilmington.froilansfarm.StructureTests;

import com.zipcodewilmington.froilansfarm.Mammal.Horse;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void testAdd() {
        //given
        Horse horse = new Horse("Annabell");
        //when
        Stable stable = new Stable();
        stable.add(horse);
        //then
        Assert.assertTrue(stable.getHorseList().contains(horse));
    }

    @Test
    public void testRemove() {
        //given
        Horse horse1 = new Horse("Annabell");
        Horse horse2 = new Horse("Ruth");
        //when
        Stable stable = new Stable();
        stable.add(horse1);
        stable.add(horse2);
        stable.remove(horse1);
        //then
        Assert.assertFalse(stable.getHorseList().contains(horse1));
    }

    @Test
    public void testImplementation() {
        Stable stable = new Stable();
        Assert.assertTrue(stable instanceof Shelter);
    }
}