package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNumberSQRForNumbersFromRange() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();

        //подготавливаем данные
        int min = 200;
        int max = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.numberSQR(min, max);

        assertEquals(expected, actual);
        System.out.println(actual);
    }


}