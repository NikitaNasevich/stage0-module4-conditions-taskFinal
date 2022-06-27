package school.mjc.stage0.conditions.finalTask;

import org.junit.jupiter.api.Test;
import school.mjc.stage0.base.BaseIOTest;

class SeasonDeterminerTest extends BaseIOTest {

    @Test
    void tellTheSeasonPrintsWinterWhenFebruary() {
        SeasonDeterminer determiner = new SeasonDeterminer();

        determiner.tellTheSeason(2);

        assertOutEquals("Winter\n");
    }

    @Test
    void tellTheSeasonPrintsWinterWhenDecember() {
        SeasonDeterminer determiner = new SeasonDeterminer();

        determiner.tellTheSeason(12);

        assertOutEquals("Winter\n");
    }

    @Test
    void tellTheSeasonPrintsSummerWhenJune() {
        SeasonDeterminer determiner = new SeasonDeterminer();

        determiner.tellTheSeason(6);

        assertOutEquals("Summer\n");
    }

    @Test
    void tellTheSeasonPrintsWrongSeasonWhenZero() {
        SeasonDeterminer determiner = new SeasonDeterminer();

        determiner.tellTheSeason(0);

        assertOutEquals("Wrong month number\n");
    }

}