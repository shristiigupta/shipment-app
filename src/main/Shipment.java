public class Shipment {
    private String id;
    private int startTime;
    private int endTime;

    public Shipment(String id, int startTime, int endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() { return startTime; }
    public int getEndTime() { return endTime; }
}