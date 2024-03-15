import org.junit.Assert;
import org.testng.annotations.Test;
public class DiceTest {


    @Test
    public void testSum(){
        Dice sumMethod = new Dice(4);
        int sum = sumMethod.diceRollResult();
        Assert.assertTrue(sum >= 4 && sum <= 24);
    }
@Test
    public void testSum2(){
        Dice sumMethod = new Dice(5);
        int sum = sumMethod.diceRollResult();
        Assert.assertTrue(sum >= 5 && sum <= 30);
    }
@Test
    public void testSum3(){
        Dice sumMethod = new Dice(6);
        int sum = sumMethod.diceRollResult();
        Assert.assertTrue(sum >= 6 && sum <= 36);
    }
  
}
//I don't get why the "Failed to load class" is