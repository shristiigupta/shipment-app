import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SchedulerTest {

    @Test
    void testConflictDetection() {
        Shipment s1 = new Shipment("S1", 1, 5);
        Shipment s2 = new Shipment("S2", 4, 8);

        assertTrue(Scheduler.hasConflict(s1, s2));
    }

    @Test
    void testNoConflict() {
        Shipment s1 = new Shipment("S1", 1, 3);
        Shipment s2 = new Shipment("S2", 3, 5);

        assertFalse(Scheduler.hasConflict(s1, s2));
    }

    @Test
    void testValidSchedule() {
        List<Shipment> list = new ArrayList<>();
        list.add(new Shipment("S1", 1, 3));
        list.add(new Shipment("S2", 3, 5));

        assertTrue(Scheduler.isValidSchedule(list));
    }

    @Test
    void testInvalidSchedule() {
        List<Shipment> list = new ArrayList<>();
        list.add(new Shipment("S1", 1, 5));
        list.add(new Shipment("S2", 4, 6));

        assertFalse(Scheduler.isValidSchedule(list));
    }
}