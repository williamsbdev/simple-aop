package com.williamsbdev;

public interface ShiftService {
    Shift findShiftById(String id);
    Shift findShiftByName(String name);
}
