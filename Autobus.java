public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;

public String getKennzeichen()
{
    return kennzeichen;
}

public int getsitzplatze()
{
    return sitzplatze;
}

public boolean getanhanger()
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