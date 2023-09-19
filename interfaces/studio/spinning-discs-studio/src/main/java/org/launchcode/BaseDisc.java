package org.launchcode;

public abstract class BaseDisc {
    private final String name;
    private int capacity;
    private final int spinSpeed;
    private final String diskType;

    public BaseDisc(String name, int capacity, int spinSpeed, String diskType) {
        this.name = name;
        this.capacity = capacity;
        this.spinSpeed = spinSpeed;
        this.diskType = diskType;
    }

    public String getName() {
        return name;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public String getDiskType() {
        return diskType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "Capacity: " + this.capacity + "\n" + "Spin Speed: " + this.spinSpeed + "\n" + "Disk Type: " + this.diskType;
    }

}
