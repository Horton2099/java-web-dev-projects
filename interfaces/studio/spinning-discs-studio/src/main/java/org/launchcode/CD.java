package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String name, int capacity, int spinSpeed, String diskType) {
        super(name, capacity, spinSpeed, diskType);
    };

    @Override
    public void spinDisc() {
        System.out.println("A cd spins at " + this.getSpinSpeed() + "rpm.");
    }

    @Override
    public HashMap<String, String> readData() {
        HashMap<String, String> diskInfo = new HashMap<>();
        diskInfo.put("Name", this.getName());
        diskInfo.put("Capacity", Integer.toString(this.getCapacity()));
        diskInfo.put("RPM", Integer.toString(this.getSpinSpeed()));
        diskInfo.put("Disk Type", this.getDiskType());
return diskInfo;
    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void reportData() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
