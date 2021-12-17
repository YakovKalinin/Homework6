package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatServiceTest {
    @Test
    void shouldCalcSum () {
        StatService service = new StatService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindAvg () {
        StatService service = new StatService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvg(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMinSalesMonth () {
        StatService service = new StatService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMaxSalesMonth () {
        StatService service = new StatService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalcMinMonth () {
        StatService service = new StatService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesUnderAvg(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalcMaxMonth () {
        StatService service = new StatService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesOverAvg(managerSales);
        assertEquals(expected, actual);
    }
}