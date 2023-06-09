package org.example;

public class GraphicalCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicalCard() {
        this.brand = "samsung";
        this.series = 540;
        this.memory = "4GB";
    }

    public GraphicalCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GraphicalCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
