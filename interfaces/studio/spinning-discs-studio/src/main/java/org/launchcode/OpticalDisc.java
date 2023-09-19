package org.launchcode;

import java.util.HashMap;

public interface OpticalDisc {

//    static final int maxStorage = ;

    // Spin Disc will output unique msg
    void spinDisc();
    HashMap<String, String> readData();
    void storeData();
    void writeData();
    void reportData();

}
