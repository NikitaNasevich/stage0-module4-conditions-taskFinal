package school.mjc.stage0.conditions.finalTask;

import org.junit.jupiter.api.Test;
import school.mjc.stage0.base.BaseIOTest;

class DaysInMonthTest extends BaseIOTest {

    @Test
    void printDaysFebNonLeap() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(2001, 2);

        assertOutEquals("28\n");
    }

    @Test
    void printDaysJune() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(2001, 6);

        assertOutEquals("30\n");
    }

    @Test
    void printDaysFebLeapWhen2000() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(2000, 2);

        assertOutEquals("29\n");
    }

    @Test
    void printDaysFebLeapWhen20thCentury() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(1900, 2);

        assertOutEquals("28\n");
    }

    @Test
    void printDaysFebLeap() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(2004, 2);

        assertOutEquals("29\n");
    }

    @Test
    void printDaysInvalidDateWrongMonth() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(2000, 13);

        assertOutEquals("invalid date\n");
    }

    @Test
    void printDaysInvalidDateWrongYear() {
        DaysInMonth daysInMonth = new DaysInMonth();

        daysInMonth.printDays(-2000, 13);

        assertOutEquals("invalid date\n");
    }
}
