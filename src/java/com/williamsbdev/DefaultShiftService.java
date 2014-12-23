package com.williamsbdev;

import java.util.List;
import java.util.ArrayList;

public class DefaultShiftService implements ShiftService {

    private List<Shift> shifts = new ArrayList<>();

    DefaultShiftService() {
        shifts.add(new Shift("First", 1));
        shifts.add(new Shift("Second", 2));
        shifts.add(new Shift("Third", 3));
    }

    public Shift findShiftById(String id) {
        for(Shift shift : shifts) {
            if(shift.getId() == id) {
                System.out.println("Found requested shift with id " + id);
                return shift;
            }
        }
        System.out.println("Unable to find requested shift with id " + id);
        return null;
    }

    public Shift findShiftByName(String name) {
        for(Shift shift : shifts) {
            if(shift.getName() == name) {
                System.out.println("Found requested shift with name " + name);
                return shift;
            }
        }
        System.out.println("Unable to find requested shift with name " + name);
        return null;
    }

    public List<Shift> getShifts() {
        return shifts;
    }
}
