import org.example.Rectangle;
import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {

    @Test
    public void calculateRectangleArea(){
        Rectangle rectangle = new Rectangle(10,20);
        int actualResult = rectangle.area();
        Assert.assertEquals(200, actualResult);
    }

    @Test
    public void calculatePerimeterGivenValidInput(){
        Rectangle rectangle = new Rectangle(10,20);
        int actualResult = rectangle.perimeter();
        Assert.assertEquals(60, actualResult);
    }

    @Test
    public void calculateAreaGivenInvalidInput() {
        Rectangle rectangle = new Rectangle(10,-20);
        Assert.assertThrows(IllegalArgumentException.class, rectangle::area);
    }

    @Test
    public void calculatePerimeterGivenInvalidInput() {
        Rectangle rectangle = new Rectangle(10,-20);
        Assert.assertThrows(IllegalArgumentException.class, rectangle::perimeter);
    }

    @Test
    public void calculateSquareAreaGivenValidInput() {
        Rectangle rectangle = new Rectangle(4,4);
        int actualResult = rectangle.area();
        Assert.assertEquals(16, actualResult);
    }

    @Test
    public void calculateSquarePerimeterGivenValidInput(){
        Rectangle rectangle = new Rectangle(10,10);
        int actualResult = rectangle.perimeter();
        Assert.assertEquals(40, actualResult);
    }
}
