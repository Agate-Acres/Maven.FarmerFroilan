package com.zipcodewilmington.froilansfarm.Food;

public class CornStalk extends Crop {

    public CornStalk(){
        super();
    }

    @Override
    public EarCorn yield () {
        if(this.checkFertilized() && !this.checkHarvested()){  // does check harvested have to be false in order to harvest th corn?
            this.setHarvested(true);
            return new EarCorn();
        }
        return null;
    }

}