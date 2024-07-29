package org.example;

public class WaterTank {
    private final int emptyWeight;
    private final int totalCapacity;
    private int fillLevel;
    private static int totalVolume;

    public WaterTank(int emptyWeight, int totalCapacity) {
        this.emptyWeight = emptyWeight;
        this.totalCapacity = totalCapacity;
        this.fillLevel = 0;
        totalVolume += totalCapacity;
    }

    public int getTotalWeight() {
        return emptyWeight + fillLevel;
    }

    public int fill(int liters) {
        if (fillLevel + liters > totalCapacity) {
            int excessWater = (fillLevel + liters) - totalCapacity;
            fillLevel = totalCapacity;
            return excessWater;
        }
        fillLevel += liters;
        return 0;
    }

    public int empty(int liters) {
        if (fillLevel < liters) {
            int removedWater = fillLevel;
            fillLevel = 0;
            return removedWater;
        }
        fillLevel -= liters;
        return liters;
    }

    public static int getTotalVolume() {
        return totalVolume;
    }
}