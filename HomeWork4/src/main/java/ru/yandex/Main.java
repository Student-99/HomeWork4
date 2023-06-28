package ru.yandex;


public class Main {
    public static void main(String[] args) {
        int i;
        i = BrokenOrder.countBrokenOrderV1("7 6 5 4 3 2 1");
        System.out.println("v1: "+i);
        i = BrokenOrder.countBrokenOrderV2("7 6 5 4 3 2 1");
        System.out.println("v2: "+i);
        i = BrokenOrder.countBrokenOrderV3("7 6 5 4 3 2 1");
        System.out.println("v3: "+i);
    }
}