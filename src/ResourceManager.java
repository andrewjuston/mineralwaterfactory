import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ResourceManager {

    private final int plastics;
    private final int water;
    private final int ink;

    public ResourceManager(int plastics, int water, int ink) {
        this.plastics = plastics;
        this.water = water;
        this.ink = ink;
    }

    public int estimatedNumberOfBottle(){
        int[] materials={this.plastics/8, this.water, this.ink};
        Arrays.sort(materials);
        return materials[0];
    }

    public ProductionLine sendToProductionLine(int plastics, int ink, int water){
        return new ProductionLine(plastics,ink, water);
    }

}
