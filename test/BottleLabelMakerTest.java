import org.junit.Assert;
import org.junit.Test;

public class BottleLabelMakerTest {

    @Test
    public void produceLabel_shouldReturnLabel_whenInputPlastic2andInk1(){
        BottleLabel expected = new BottleLabel();

        BottleLabel actual = new BottleLabelMaker(2, 1).produceBottleLabel();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ProductionException.class)
    public void produceBottle_shouldReturnException_whenInputPlastic1AndInk0(){
        BottleLabel expected = new BottleLabel();

        BottleLabel actual = new BottleLabelMaker(1, 0).produceBottleLabel();

    }
}
