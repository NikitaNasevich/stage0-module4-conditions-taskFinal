package school.mjc.stage0.conditions.finalTask;

import org.junit.jupiter.api.Test;
import school.mjc.stage0.base.BaseIOTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerDividerTest extends BaseIOTest {

    @Test
    void printCompletelyDividedCanBe() {
        IntegerDivider divider = new IntegerDivider();

        divider.printCompletelyDivided(25, 5);

        assertOutEquals("can be divided completely\n");
    }

    @Test
    void printCompletelyDividedCannotBe() {
        IntegerDivider divider = new IntegerDivider();

        divider.printCompletelyDivided(25, 15);

        assertOutEquals("cannot be divided completely\n");
    }

    @Test
    void printCompletelyDividedByZero() {
        IntegerDivider divider = new IntegerDivider();

        divider.printCompletelyDivided(25, 0);

        assertOutEquals("division by zero\n");
    }

    @Test
    void notContainsRemainderDivisionLines() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/finalTask/IntegerDivider.java");
        List<String> strings = Files.readAllLines(path);
        List<String> remainderDivisionLines = strings.stream()
                .filter(line -> line.contains("%"))
                .collect(Collectors.toList());

        assertEquals(0, remainderDivisionLines.size());
    }
}