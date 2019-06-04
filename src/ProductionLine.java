public class ProductionLine {

    private int plastics;
    private int water;
    private int ink;

    public ProductionLine(int plastics, int water, int ink) {
        this.plastics = plastics;
        this.water = water;
        this.ink = ink;
    }

    private Cap getBottleCap(){
        this.plastics--;
        return new CapMaker(1).produceCap();
    }

    private Bottle getBottle(){
        this.plastics -= 5;
        return new BottleMaker(5).produceBottle();
    }

    private BottleLabel getLabel(){
        this.plastics -= 2;
        this.ink--;
        return new BottleLabelMaker(2,1).produceBottleLabel();
    }

    private CompleteBottle getCompleteBottle(){
        return new BottleAssembler(getBottleCap(), getBottle(), getLabel()).assembleBottle();
    }

    public MineralWater produceMineralWater(){
        return new WaterDispenser(getCompleteBottle(), this.water).getMineralWater();
    }

    public String remainingMaterials(){
        return "remaining materials "+ this.plastics+ " plastics, " +
                this.water+" water, "+ this.ink + " ink.";

    }

}
