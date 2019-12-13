package com.luciopaiva;

class Utils {

    private static String[] BYTE_UNITS = {"B", "kB", "MB", "GB", "TB"};

    static String bytesToHumanReadableValue(long valueInBytes) {
        int unitsIndex = 0;
        double value = valueInBytes;
        while (value > 1024d && unitsIndex < BYTE_UNITS.length - 1) {
            value /= 1024d;
            unitsIndex++;
        }
        return String.format("%d%s", Math.round(value), BYTE_UNITS[unitsIndex]);
    }
}
