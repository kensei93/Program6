package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllSale() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumAllSale(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.average(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonht = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonht);
    }

    @Test
    public void monthPeakSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void testcalcMothesSaleBellowAverage() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = 5;
        int expected = service.calcMothesSaleBellowAverage(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testcalcMothesSaleUpAverage() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = 5;
        int expected = service.calcMothesSaleBellowAverage(month);

        Assertions.assertEquals(expected, actual);
    }
}




