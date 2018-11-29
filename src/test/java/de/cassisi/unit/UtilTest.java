package de.cassisi.unit;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testIstErstesHalbjahr() {
        assertTrue("Januar liegt im ersten Halbjahr", Util.istErstesHalbjahr(1));
        assertFalse("Dezember liegt nicht im ersten Halbjah", Util.istErstesHalbjahr(12));
        assertFalse("Juli sollte im zweiten Halbjahr liegen", Util.istErstesHalbjahr(7));
    }

}
