package ru.academit.ilnitsky.shapes_core;

/**
 * Created by UserLabView on 10.10.16.
 * Вычисление некоего подобия hash-функции для double
 */
public class HashCode {
    public static int hashCode(double value) {
        /*
        int shift = 1000;
        int exponent = Math.getExponent(value);
        int mantissa = (int) (value / Math.pow(2, exponent) * shift);

        int result = 127;
        result += (1024 + exponent) * shift;
        result += 3 * shift + mantissa;
        return result;
        */

        // Почему-то не знает функцию  Math.getExponent()
        // хотя для проекта была выбрана версия java 1.8

        return (int)value;
    }
}
