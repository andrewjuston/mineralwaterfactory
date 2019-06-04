public class BottleLabelMaker {

    private final int plasticQuantity;
    private final int inkQuantity;

    public BottleLabelMaker(int plasticQuantity, int inkQuantity) {
        this.plasticQuantity = plasticQuantity;
        this.inkQuantity = inkQuantity;
    }

    public BottleLabel produceBottleLabel(){
        if(this.inkQuantity != 1 && this.plasticQuantity != 2)
            throw new ProductionException("Can't Produce Bottle Label!");
        return new BottleLabel();
    }
}
