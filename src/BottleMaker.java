public class BottleMaker {
    private final int plasticQty;

    public BottleMaker(int plasticQty) {
        this.plasticQty = plasticQty;
    }

    public Bottle produceBottle() {
        if(this.plasticQty != 5)
            throw new ProductionException("Can't Produce Bottle!");

        return new Bottle();
    }
}
