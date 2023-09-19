package org.launchcode;

import java.util.HashMap;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String name, int capacity, int spinSpeed, String diskType) {
        super(name, capacity, spinSpeed, diskType);
    };

    @Override
    public void spinDisc() {

    }

    @Override
    public HashMap<String, String> readData() {
        return null;
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
