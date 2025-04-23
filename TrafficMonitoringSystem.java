import java.util.Scanner;

class TrafficMonitoringSystem {
    // Static variables to track city-wide data
    static int totalVehiclesMonitored = 0;
    static int highCongestionCount = 0;
    
    // Define intersections
    static String[] intersections = {"A", "B", "C", "D", "E"};
    
    // Method to calculate average speed for an intersection
    public static double calculateAverageSpeed(int[][] speeds) {
        int totalSpeed = 0;
        int count = 0;
        
        for (int i = 0; i < speeds.length; i++) {
            for (int j = 0; j < speeds[i].length; j++) {
                totalSpeed += speeds[i][j];
                count++;
            }
        }
        return (double) totalSpeed / count;
    }
    
    // Method to determine congestion level
    public static String determineCongestionLevel(int totalVehicles, double avgSpeed) {
        if (totalVehicles > 700 || avgSpeed < 30) {
            highCongestionCount++;
            return "High";
        } else if (totalVehicles > 600 || avgSpeed < 40) {
            return "Moderate";
        } else {
            return "Low";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Store traffic data
        int[][][] hourlySpeeds = new int[5][24][4]; // 5 intersections, 24 hours, 4 road segments
        int[][] vehicleCounts = new int[5][4]; // 5 intersections, 4 road segments
        
        for (int i = 0; i < intersections.length; i++) {
            System.out.println("Enter hourly speeds for intersection " + intersections[i] + " (24 hours, 4 segments each):");
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 4; k++) {
                    hourlySpeeds[i][j][k] = scanner.nextInt();
                }
            }
            
            System.out.println("Enter vehicle counts for intersection " + intersections[i] + " (4 road segments):");
            for (int k = 0; k < 4; k++) {
                vehicleCounts[i][k] = scanner.nextInt();
                totalVehiclesMonitored += vehicleCounts[i][k];
            }
        }
        
        // Generate Traffic Report
        System.out.println("\nSmart City Traffic Monitoring Report:");
        for (int i = 0; i < intersections.length; i++) {
            int totalVehicles = 0;
            for (int k = 0; k < 4; k++) {
                totalVehicles += vehicleCounts[i][k];
            }
            
            double avgSpeed = calculateAverageSpeed(hourlySpeeds[i]);
            String congestionLevel = determineCongestionLevel(totalVehicles, avgSpeed);
            
            System.out.printf("Intersection %s: - Total Vehicles: %d - Average Speed: %.1f km/h - Congestion Level: %s%n",
                              intersections[i], totalVehicles, avgSpeed, congestionLevel);
        }
        
        System.out.println("\nCitywide Totals:");
        System.out.println("- Total Vehicles Monitored: " + totalVehiclesMonitored);
        System.out.println("- High Congestion Intersections: " + highCongestionCount);
        
        scanner.close();
    }
}
