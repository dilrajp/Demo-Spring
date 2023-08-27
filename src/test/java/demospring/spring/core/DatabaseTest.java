package demospring.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    
    @Test
    void testSingletion(){

        var database1 = Database.getInstanceDatabase();
        var database2 = Database.getInstanceDatabase();

        Assertions.assertSame(database1, database2);
    }
}
