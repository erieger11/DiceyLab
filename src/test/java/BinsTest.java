import org.junit.Assert;
import org.testng.annotations.Test;
public class BinsTest {


@Test
    public void testBins(){
    Bins arrayResult = new Bins(2,12);
    arrayResult.addingResults(7);
    Assert.assertEquals(1,arrayResult.returningResults(7));

}
    @Test
    public void testBins1(){
        Bins arrayResult = new Bins(2,12);
        arrayResult.addingResults(7);
        arrayResult.addingResults(7);
        Assert.assertEquals(2,arrayResult.returningResults(7));

    }
    @Test
    public void testBins2(){
        Bins arrayResult = new Bins(2,12);
        arrayResult.addingResults(7);
        arrayResult.addingResults(7);
        arrayResult.addingResults(7);
        Assert.assertEquals(3,arrayResult.returningResults(7));

    }
}