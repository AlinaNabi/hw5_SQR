package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRService {

    @Test
    void shouldCalculateForRegisteredAndBonusUnderLimit() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();



        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }




}