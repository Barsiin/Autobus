public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;
    
    
    public Autobus()
    {
        setkennzeichen("W-1234A");
        setSitzplatze(29);
        setAnhanger(false);
    }
    
    public Autobus ( String neuKennzeichen, int neuSitzplatze, boolean neuAnhanger)
    {
        setkennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
    
    public Autobus(String neuKennzeichen, int neuSitzplatze)
    { 
       setkennzeichen(neuKennzeichen);
       setSitzplatze(neuSitzplatze);
       setAnhanger(false);  
    }
    
    public Autobus( String neuKennzeichen)
    {
        setkennzeichen(neuKennzeichen);
        setSitzplatze(29);
        setAnhanger(false);
    }
    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    
    public int sitzplatze()
    {
        return sitzplatze;
    }
    
    public boolean anhanger()
    {
        return anhanger;
    }
    
    public void setkennzeichen( String neuKennzeichen)
    {
        kennzeichen=neuKennzeichen;
    }
    
    public void setSitzplatze( int neuSitzplatze)
    {
        sitzplatze=neuSitzplatze;
    }
    
    public void setAnhanger( boolean neuAnhanger)
    {
        anhanger=neuAnhanger;
    }
    
    
}
