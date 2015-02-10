package Dental;

/**
 *
 * @author vikash.loomba
 */
class DentalBill {
    //Instance Variables and constants
    static final double CLEANING = 35.0,
                        CAVITY = 150.0,
                        XRAY = 85.0,
                        FLOURITE = 50.0,
                        ROOT = 225.0;
    double total = 000.0;
    
    private String patientName;
    private boolean cleaning;
    private boolean cavity;
    private boolean xray;
    private boolean flouride;
    private boolean rootCanal;
    private boolean other;
    private double amount = 0.0;
    
    //default constructor--needs javadocs
    public DentalBill()
    {
        patientName = "";
        cleaning = false;
        cavity = false;
        flouride = false;
        xray = false;
        rootCanal = false;
        other = false;
        amount = 0.0;
    }
      
    
    //overloaded constructer
    
    public DentalBill(String name, boolean clean, boolean cav, boolean xr, boolean flo, boolean root, boolean other, double otherAmount)
    {
        patientName = name;
        cleaning = clean;
        cavity = cav;
        flouride = flo;
        xray = xr;
        rootCanal = root;
        this.other = other;
        amount = otherAmount;
    }
    
    //Calculate the bill method
    public double calculateBill()
    {
        if(cleaning)
            total += CLEANING;
        if(cavity)
            total += CAVITY;
        if(xray)
            total += XRAY;
        if(flouride)
            total += FLOURITE;
        if(rootCanal)
            total += ROOT;
        if(other)
            total += amount;
        return total;
    }
    
    public double getAmount()
    {
        return 0;

    }
}
