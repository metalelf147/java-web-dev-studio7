package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD topKpopHits = new CD();
        topKpopHits.setName("Top Kpop Hits");
        topKpopHits.setCapacity(4.6f);
        topKpopHits.setContents("Top Korean pop hits from the 1990's to 2015");
        topKpopHits.setDiscType("CDROM");

        topKpopHits.spinDisc();
        System.out.println(topKpopHits.getName());


        DVD kikisDeliveryService = new DVD();
        kikisDeliveryService.setName("Kiki's Delivery Service");
        kikisDeliveryService.setCapacity(9.6f);
        kikisDeliveryService.setContents("The best Studio Ghibli movie ever");
        kikisDeliveryService.setDiscType("DVD");


        kikisDeliveryService.ejectDisc();
        kikisDeliveryService.insertDisc();
        kikisDeliveryService.readDataWithLaser();
        kikisDeliveryService.storeDataWithLaser();
        System.out.println(kikisDeliveryService.getContents());



    }
}


// specific class
// report info like name, capacity, contents, disc type