import org.junit.Test;

public class ResourceManagerTest {
    @Test
    public void allocateResource_shouldReturnTheNoOfProduction_whenGivenNumberOfWaterPlasticInk(){
        ResourceManager expected = new ResourceManager(7, 1,1);
    }
}
