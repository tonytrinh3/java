package Composition;


/**
 * Created by keanehubertang on 8/3/15.
 */

 
public class PC {
    //it creates memory reference for that variable name, but that reference isn't pointing to an actual object yet since it hasn't been created in memory. 
    private Case theCase; //this means you calling an object with a name to it
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard; //this is actually the object 
    }
}
