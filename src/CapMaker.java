import java.util.Objects;

public class CapMaker {

    final private int plasticQty;

    public CapMaker(int plasticQty) {
        this.plasticQty = plasticQty;
    }

    public Cap produceCap() {
        if(this.plasticQty != 1)
            throw new ProductionException("Can't Produce Cap!");
        return new Cap();
    }
}
