import java.util.List;



public class Scheduler {

    // Conflict detection
    public static boolean hasConflict(Shipment s1, Shipment s2) {
        return !(s1.getEndTime() <= s2.getStartTime() ||
                 s2.getEndTime() <= s1.getStartTime());
    }

    // Validate full schedule
    public static boolean isValidSchedule(List<Shipment> shipments) {
        for (int i = 0; i < shipments.size(); i++) {
            for (int j = i + 1; j < shipments.size(); j++) {
                if (hasConflict(shipments.get(i), shipments.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}