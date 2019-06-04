import org.junit.Assert;
import org.junit.Test;

public class CapMakerTest {

    @Test
    public void produceCap_shouldReturnNewCap_whenInput1(){
        Cap expected = new Cap();

        Cap actual = new CapMaker(1).produceCap();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ProductionException.class)
    public void produceCap_shouldReturnNewCap_whenInput0(){
        Cap expected = new Cap();

        Cap actual = new CapMaker(0).produceCap();
    }

}
