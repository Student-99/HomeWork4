

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

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

    @ParameterizedTest
    @MethodSource("arraysForIsSortedTest")
    void isSortedTest(int[] array, boolean isSorted) {
        Assertions.assertEquals(BrokenOrder.isSorted(array), isSorted);
    }

    @ParameterizedTest
    @MethodSource("arraysForMaxTwinMultiplyTest")
    void maxTwinMultiplyTest(int[] array, int expected) {
        Assertions.assertEquals(BrokenOrder.maxTwinMultiply(array), expected);
    }

    @ParameterizedTest
    @CsvSource({
        "aaaabbbcdd,4(a)3(b)1(c)2(d)",
        "abc,1(a)1(b)1(c)",
        "aaaaaaaaaa,10(a)"
    })
    void rleCompressTest(String line,String expected){
        Assertions.assertEquals(BrokenOrder.rleCompress(line),expected);
    }

    private static Stream<Arguments> arraysForMaxTwinMultiplyTest() {
        return Stream.of(
            Arguments.arguments(new int[]{9, 2, 3, 4, 5, 6, 7, 8, 9}, 72),
            Arguments.arguments(new int[]{-9, -2, -3, -4, -5, -6, -7, -8, -9}, 6)
        );
    }

    private static Stream<Arguments> arraysForIsSortedTest() {
        return Stream.of(
            Arguments.arguments(new int[]{7, 2, 3, 4, 5, 7, 6}, false),
            Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6, 7}, true)
        );
    }
}
