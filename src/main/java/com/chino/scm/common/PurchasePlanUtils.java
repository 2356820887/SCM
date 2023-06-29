package com.chino.scm.common;

public class PurchasePlanUtils {
    private static  Integer number;
    public static Integer generatePurchasePlanNumber() {
        if (number == null){
            number = (int) ((Math.random() * 9 + 1) * 100000);
        }
        return number;
    }

    public static void clearPurchasePlanNumber() {
        number = null;
    }

    public static void main(String[] args) {
        System.out.println(generatePurchasePlanNumber());
    }
}
