import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ru.yandex.BrokenOrder;

public class Test {
    @ParameterizedTest
    @CsvSource({"2 4 1 9 7,2",
        "1 2 3 4 5 6 7,0",
        "70 6 5 4 3 2 1,6"})
    void testV1(String line, int expected) {
        int count = BrokenOrder.countBrokenOrderV1(line);
        Assertions.assertEquals(expected, count);
    }

    @ParameterizedTest
    @CsvSource({"2 4 1 9 7,2",
        "1 2 3 4 5 6 7,0",
        "70 6 5 4 3 2 1,6"})
    void testV2(String line, int expected) {
        int count = BrokenOrder.countBrokenOrderV2(line);
        Assertions.assertEquals(expected, count);
    }

    @ParameterizedTest
    @CsvSource({"2 4 1 9 7,2",
        "1 2 3 4 5 6 7,0",
        "70 6 5 4 3 2 1,6"})
    void testV3(String line, int expected) {
        int count = BrokenOrder.countBrokenOrderV3(line);
        Assertions.assertEquals(expected, count);
    }
}
