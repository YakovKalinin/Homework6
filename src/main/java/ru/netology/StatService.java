package ru.netology;

import org.jetbrains.annotations.NotNull;

public class StatService {
    public int calcSum(int @NotNull [] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {

        return calcSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int salesUnderAvg(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            if (sale < findAvg(sales)) {
                sumMonth++;
            }
        }
        return sumMonth;
    }

    public int salesOverAvg(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            if (sale > findAvg(sales)) {
                sumMonth++;
            }
        }
        return sumMonth;
    }
}
