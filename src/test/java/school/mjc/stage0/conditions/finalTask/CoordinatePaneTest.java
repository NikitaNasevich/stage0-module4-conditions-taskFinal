package school.mjc.stage0.conditions.finalTask;

import org.junit.jupiter.api.Test;
import school.mjc.stage0.base.BaseIOTest;

class CoordinatePaneTest extends BaseIOTest {

    @Test
    void printQuadrantFirstWhenXYPositive() {
        CoordinatePane pane = new CoordinatePane();

        pane.printQuadrant(1,1);

        assertOutEquals("first\n");
    }
    @Test
    void printQuadrantSecondWhenXPositiveYNegative() {
        CoordinatePane pane = new CoordinatePane();

        pane.printQuadrant(1,-1);

        assertOutEquals("second\n");
    }
    @Test
    void printQuadrantThirdWhenXYNegative() {
        CoordinatePane pane = new CoordinatePane();

        pane.printQuadrant(-1,-1);

        assertOutEquals("third\n");
    }

    @Test
    void printQuadrantFourthWhenXNegativeYPositive() {
        CoordinatePane pane = new CoordinatePane();

        pane.printQuadrant(-1,1);

        assertOutEquals("fourth\n");
    }

    @Test
    void printQuadrantZeroWhenXYZero() {
        CoordinatePane pane = new CoordinatePane();

        pane.printQuadrant(0,0);

        assertOutEquals("zero\n");
    }
}