package ru.netology.stats;

public class StatsService {

    public int calculateTotalSales(long[] sales) {
        int totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public int calculateAverageSales(long[] sales) {
        int totalSales = calculateTotalSales(sales);
        int averageSales = totalSales / sales.length;
        return averageSales;
    }

    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateNumberOfMonthsBelowAverage(long[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int calculateNumberOfMonthsAboveAverage(long[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
