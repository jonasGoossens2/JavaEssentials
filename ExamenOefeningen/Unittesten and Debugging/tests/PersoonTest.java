import org.junit.Test;
import testclasses.Persoon;

import static org.junit.Assert.assertEquals;

public class PersoonTest {

    @Test
    public void testGetVolledigeNaam(){
        Persoon p = new Persoon("Goossens", "Jonas");
        assertEquals("Jonas Goossens", p.getVolledigeNaam());
    }

    @Test
    public void testGetVolledigeNaamIndienNaamNull(){
        Persoon p = new Persoon(null, "Jonas");
        assertEquals("Jonas ?", p.getVolledigeNaam());
    }

    @Test
    public void testGetVolledigeNaamIndienVoornaamNull(){
        Persoon p = new Persoon("Goossens", null);
        assertEquals("? Goossens", p.getVolledigeNaam());
    }
}
