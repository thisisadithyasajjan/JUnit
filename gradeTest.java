import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gradeTest {

    @Test
    void returnFirstClass() {
        grade g = new grade();
        assertEquals("First Class", g.gradeLetter(6.5));
    }
    @Test
    void returnPassClass() {
        grade g = new grade();
        assertTrue(g.gradeLetter(5.5) == "Pass Class");
    }
}