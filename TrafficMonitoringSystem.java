import java.util.Random;

class TrafficMonitoringSystem {
    // Static variables for city-wide statistics
    private static int totalVehiclesMonitored = 0;
    private static int highCongestionCount = 0;

    // Intersections & road segments
    private static final String[] INTERSECTIONS = {"A", "B", "C", "D", "E"};
    private static final String[] DIRECTIONS = {"North", "South", "East", "West"};

    // Traffic data storage
    private int[][] hourlySpeeds;  // [24][4] - Speeds for each hour and road segment
    private int[] vehicleCounts;   // [4] - Total vehicles per road segment

    // Constructor to initialize data
    public TrafficMonitoringSystem(int[][] speeds, int[] counts) {
        this.hourlySpeeds = speeds;
        this.vehicleCounts = counts;
        for (int count : counts) {
            totalVehiclesMonitored += count;
        }
    }

    // Calculate the average speed at the intersection
    public double calculateAverageSpeed() {
        int sum = 0, totalEntries = 0;
        for (int[] hour : hourlySpeeds) {
            for (int speed : hour) {
                sum += speed;
                totalEntries++;
            }
        }
        return (double) sum / totalEntries;
    }

    // Calculate total vehicles for the intersection
    public int getTotalVehicles() {
        int sum = 0;
        for (int count : vehicleCounts) {
            sum += count;
        }
        return sum;
    }

    // Determine congestion level based on speed and vehicle density
    public String determineCongestionLevel(double avgSpeed, int totalVehicles) {
        String congestion;
        if (totalVehicles > 700 || avgSpeed < 35) {
            congestion = "High";
            highCongestionCount++;
        } else if (totalVehicles > 600 || avgSpeed < 45) {
            congestion = "Moderate";
        } else {
            congestion = "Low";
        }
        return congestion;
    }

    // Generate report for a single intersection
    public void generateReport(String intersectionName) {
        double avgSpeed = calculateAverageSpeed();
        int totalVehicles = getTotalVehicles();
        String congestionLevel = determineCongestionLevel(avgSpeed, totalVehicles);

        System.out.printf("Intersection %s: - Total Vehicles: %d - Average Speed: %.1f km/h - Congestion Level: %s%n",
                intersectionName, totalVehicles, avgSpeed, congestionLevel);
    }

    // Static method to display citywide summary
    public static void displayCitySummary() {
        System.out.println("\nCitywide Totals:");
        System.out.println("Total Vehicles Monitored: " + totalVehiclesMonitored);
        System.out.println("High Congestion Intersections: " + highCongestionCount);
    }

    // Sample data generator
    public static int[][] generateHourlySpeeds() {
        Random rand = new Random();
        int[][] speeds = new int[24][4];
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 4; j++) {
                speeds[i][j] = rand.nextInt(31) + 30; // Speeds between 30 - 60 km/h
            }
        }
        return speeds;
    }

    public static int[] generateVehicleCounts() {
        Random rand = new Random();
        int[] counts = new int[4];
        for (int i = 0; i < 4; i++) {
            counts[i] = rand.nextInt(201) + 100; // Counts between 100 - 300
        }
        return counts;
    }

    public static void main(String[] args) {
        TrafficMonitoringSystem[] intersections = new TrafficMonitoringSystem[INTERSECTIONS.length];

        // Generate and store traffic data for each intersection
        for (int i = 0; i < INTERSECTIONS.length; i++) {
            intersections[i] = new TrafficMonitoringSystem(generateHourlySpeeds(), generateVehicleCounts());
        }

        System.out.println("Smart City Traffic Monitoring Report:");
        for (int i = 0; i < INTERSECTIONS.length; i++) {
            intersections[i].generateReport(INTERSECTIONS[i]);
        }

        // Display citywide summary
        displayCitySummary();
    }
}
