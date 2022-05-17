import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintShapeUtilsTest {
    PrintShapeUtils testedPrintShapeUtils = new PrintShapeUtils();

    @Test
    void print() {
        assertTrue(testedPrintShapeUtils.print(new Circle()).equalsIgnoreCase("Circle"),"Object Circle must return name 'Circle'");
        assertTrue(testedPrintShapeUtils.print(new Oval()).equalsIgnoreCase("Oval"),"Object Oval must return name 'Oval'");
        assertTrue(testedPrintShapeUtils.print(new Quad()).equalsIgnoreCase("Quad"),"Object Quad must return name 'Quad'");
        assertTrue(testedPrintShapeUtils.print(new Rectangle()).equalsIgnoreCase("Rectangle"),"Object Rectangle must return name 'Rectangle'");
        assertTrue(testedPrintShapeUtils.print(new Triangle()).equalsIgnoreCase("Triangle"),"Object Triangle must return name 'Triangle'");
    }
}