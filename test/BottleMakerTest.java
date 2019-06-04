import org.junit.Assert;
import org.junit.Test;

public class BottleMakerTest {

    @Test
    public void produceBottle_shouldReturnBottle_whenInput5(){
        Bottle expected = new Bottle();

        Bottle actual = new BottleMaker(5).produceBottle();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ProductionException.class)
    public void produceBottle_shouldReturnException_whenInput4(){
        Bottle expected = new Bottle();

        Bottle actual = new BottleMaker(4).produceBottle();

    }

}
