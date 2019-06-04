import org.junit.Assert;
import org.junit.Test;

public class BottleAssemblerTest {
    @Test
    public void assembleBottle_shouldReturnCompleteBottle_whenInputCapBottleAndLabel(){
        CompleteBottle expected = new CompleteBottle();

        CompleteBottle actual = new BottleAssembler(new Cap(), new Bottle(), new BottleLabel()).assembleBottle();

        Assert.assertEquals(expected, actual);
    }
}
