public class Jaeger {

    private String name;
    private String energyCore;

    private float height;
    private int weight;

    private String location;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    String getEnergyCore() {
        return energyCore;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getHeight() {
        return height;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return weight;
    }

    Jaeger() {
        this("", "", 0.0f, 0);
    }

    Jaeger(String name, String energyCore, int weight) {
        this(name, energyCore, 80.0f, weight);
    }

    Jaeger(String name, String energyCore, float height, int weight) {
        this.name = name;
        this.energyCore = energyCore;
        this.height = height;
        this.weight = weight;
    }

    void moveToLocation(String location) {
        System.out.println("\nJaeger " + name + " move to " + location);
        this.location = location;
    }

    void chargeEnergyCore() {
        System.out.println("\nJaeger " + name + "start charging " + energyCore);
    }

    void jaegerInfo() {
        System.out.println("\nInfo about jaeger " + name + ": ");
        System.out.println("Energy Core: " + energyCore);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}