import org.junit.Assert;
import org.junit.Test;

public class WaterDispenserTest {
    @Test
    public void addWater_shouldReturnMineralWater_whenInputWater1andBottle(){
        MineralWater expected = new MineralWater();

        MineralWater actual = new WaterDispenser(new CompleteBottle(), 1).getMineralWater();

        Assert.assertEquals(expected,actual);
    }
}
