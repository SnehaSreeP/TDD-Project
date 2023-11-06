import org.junit.Assert;
import org.junit.Test;


public class RectangleAreaTest {

    @Test
    public void calculateRectangleArea(){
        RectangleArea rectangleArea = new RectangleArea();
        int actualResult = rectangleArea.calculateRectangleArea(10, 20);
        Assert.assertEquals(200, actualResult);
    }
}
