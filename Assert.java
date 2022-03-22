package JavaCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Assert {
    @Test
    public void testAssertions()
    {
        String str = new String("Adi");
        String str1 = new String("Adi");
        String str2 = null;
        String str3 = "Adi";
        String str4 = "Adi";
        int val1 = 5;
        int val2 = 6;
        String exparray[] = {"one", "two", "three"};
        String resarray[] = {"one", "two", "three"};
        assertEquals(str, str1);
        assertTrue(val1 < val2);
        assertFalse(val1 < val2);
        assertNull(str2);
        assertNotNull(str1);
        assertArrayEquals(exparray, resarray);
    }
}
