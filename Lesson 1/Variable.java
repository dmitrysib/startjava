public class Variable {
    public static void main(String[] args) {
        boolean oldComputer = true;
        byte diskCount = 1;
        short cpuCores = 4;
        int memory = 16384;
        long diskAvailable = 1689190032;
        float cpuFreq = 2.3f;
        double diskFree = 21885424.0 * 100 / diskAvailable;
        char alpha = 'A';

        System.out.println("Old comuter: " + oldComputer + "\nDisks: " + diskCount + "\nCores: " + cpuCores + "\nfrequency: " + cpuFreq + " GHz");
        System.out.println("Memory: " + memory + "kb\nDisk available: " + diskAvailable + "b");
        System.out.println("Alpha is " + alpha);
        System.out.println("Used: " + diskFree + " %");
    }
}
