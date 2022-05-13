package at.fhj.msd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    public class SimpleTest{
        @BeforeEach
        public void setUp() { /* ... */ }
        @AfterEach
        public void tearDown() { /* ... */ }
        @Test
        public void testMethod() {
            /* ... */
            Assertions Assert;
            Assert.assertTrue( /* ... */ );
        }
    }
}
