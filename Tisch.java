
public class Tisch 
{
    private String Material = "UNKN";
    private int Hoehe = 0;
    private boolean Ausziehbar = false;

    public Tisch (String neuMaterial, int neuHoehe, boolean neuAusziehbar)
    {
        setMaterial(neuMaterial);
        setHoehe(neuHoehe);
        setAusziehbar(neuAusziehbar);
    }

    public String getMaterial()
    {
        return Material;
    }

    public int getHoehe()
    {
        return Hoehe;
    }

    public boolean getAusziehbar()
    {
        return Ausziehbar;
    }

    public void setMaterial (String neuMaterial)
    {
        Material = neuMaterial;
    }

    public void setHoehe (int neuHoehe)
    {
        if (neuHoehe >= 0 && neuHoehe <= 300)
        {
            Hoehe = neuHoehe;
        }
        else
        {
            System.out.println("Fehler: Höhe muss zwischen 0 und 300 liegen!");
            Hoehe = 0;
        }
    }

    public void setAusziehbar (boolean neuAusziehbar)
    {
        Ausziehbar = neuAusziehbar;
    }

    public void printTisch()
    {
        System.out.println(Material + " , " + Hoehe + " , " + Ausziehbar);
    }
}
