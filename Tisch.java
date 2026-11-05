
public class Tisch
{ 
    private String material = "UNKN";
    private int hoehe = 0;
    private boolean ausziehbar = false;
    
    public Tisch(String neuMaterial, int neuHoehe, boolean neuAusziehbar)
    {
        material = neuMaterial;
        hoehe = neuHoehe;
        ausziehbar = neuAusziehbar;
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public int getHoehe()
    {
        return hoehe;
    }
    
    public boolean getAusziehbar()
    {
        return ausziehbar;
    }
    
    public void setMaterial(String neuMaterial)
    {
        material = neuMaterial;
    }
    
    public void setHoehe(int neuHoehe)
    {
        hoehe = neuHoehe;
    }
    
    public void setAusziehbar(boolean neuAusziehbar)
    {
        ausziehbar = neuAusziehbar;
    }
    
    public void printTisch()
    {
        System.out.println(material + " Tisch: " + hoehe + " cm - " + ausziehbar);
    }
}

