package com.williamsbdev;

public class Main {

    public static void main(String[] args) {
        ShiftService shiftService = new DefaultShiftService();
        shiftService.findShiftById("123");
        shiftService.findShiftByName("First");
    }

}
