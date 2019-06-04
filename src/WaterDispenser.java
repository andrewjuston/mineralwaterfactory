public class WaterDispenser {

    private final CompleteBottle completeBottle;
    private final int water;

    public WaterDispenser(CompleteBottle completeBottle, int water) {
        this.completeBottle = completeBottle;
        this.water = water;
    }

    public MineralWater getMineralWater() {
        if(completeBottle == null || this.water != 1){
            throw new ProductionException("In order to add water, there should be a bottle" +
                    "or a litre of water to be contained by bottle");
        }
        return new MineralWater();
    }
}
