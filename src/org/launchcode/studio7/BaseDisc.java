package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{

    private String name;
    private float capacity;
    private String contents;
    private String discType;

    public BaseDisc() {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public void storeDataWithLaser(){
        System.out.println("Data for " + this.name + " stored using laser.");
    }

    @Override
    public void readDataWithLaser(){
        System.out.println("Data from " + this.name + " read using laser.");
    }

    @Override
    public void insertDisc(){
        System.out.println("Disc " + this.name + " has been inserted!");
    }

    @Override
    public void ejectDisc(){
        System.out.println("Disc " + this.name + " has been ejected!");
    }

    @Override
    public void spinDisc() {
        System.out.println("Disc " + this.name + " is spinning.");
    }
}
