public class Tisch
{ 
    public String material = "UNKN";
    public boolean ausziehbar = false;
    public int höhe = 0;
    
    
    public Tisch(String neuMaterial, boolean neuAusziehbar, int neuHöhe)
    {
        material =  neuMaterial;
        ausziehbar = neuAusziehbar;
        höhe = neuHöhe;
    }
    
    
    public String getMaterial()
    {
        return material;
    }
    
    public boolean getAusziehbar()
    {
        return ausziehbar;
    }
    
    public int getHöhe()
    {
        return höhe;
    }
    
    
    public void setMaterial(String neuMaterial)
    {
        material = neuMaterial;
    }
    
    public void setAusziehbar(boolean neuAusziehbar)
    {
        ausziehbar = neuAusziehbar;
    }
    
    public void setHöhe(int neuHöhe)
    {
        höhe = neuHöhe;
    }
    
    
    public void printTisch()
    {
        System.out.println(material + "Tisch: " + höhe + "cm - " + ausziehbar);
    }
    
    
    
}