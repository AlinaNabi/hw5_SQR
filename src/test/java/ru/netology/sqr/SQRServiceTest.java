package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number in range from 100 to 300',100,300,8",
            "'number in range from 200 to 300',200,300,3",
            "'number in range from 100 to 200',100,200,5"})
    void shouldNumberSQRForNumbersFromRange(String testSQR, int min, int max, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int actual = service.numberSQR(min, max);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}