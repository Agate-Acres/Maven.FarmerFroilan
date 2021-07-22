package com.zipcodewilmington.froilansfarm.FoodTests;

import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.Crop;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void setHarvestedTest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHarvested(true);

        boolean actual = cornStalk.checkHarvested();

        Assert.assertEquals(true, actual);

    }

    @Test
    public void checkHarvestedTest() {

        CornStalk cornStalk = new CornStalk();

        boolean actual = cornStalk.checkHarvested();

        Assert.assertEquals(false, actual);

    }

    @Test
    public void yieldTest() {

        CornStalk cornStalk = new CornStalk();
        cornStalk.checkFertilized();
        cornStalk.checkHarvested();

    }

    @Test
    public void fertilizeTest() {

    }


    @Test
    public void testCornStalkInheritance() {

        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }


}