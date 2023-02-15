package ru.netology.stats;

public class StatsService {

    public long sumAllSale(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {

        long sum = sales[0];

        for (long i : sales) {
            sum = sum + i;
        }
        long avrSum = sum / sales.length;

        return avrSum;
    }

    public int minSales(long[] sales) {

        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcMothesSaleBellowAverage(long[] sales) {
        long averageSale = average(sales);

        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }

        return counter;

    }

    public int calcMothesSaleUpAverage(long[] sales) {
        long averageSale = average(sales);

        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }

        return counter;
    }
}