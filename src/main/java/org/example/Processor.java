package org.example;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String MinFrequency;
    private String MaxFrequency;

    public Processor() {
        this.brand = "intel";
        this.series = "2017";
        this.generation = 7;
        this.threads = 5;
        this.cacheMemory = "3MB";
        this.frequency = "5GHz";
        MinFrequency = "2.5GHz";
        MaxFrequency = "3.0GHz";
    }

    public Processor(String brand, String series, int generation, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        MinFrequency = minFrequency;
        MaxFrequency = maxFrequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", MinFrequency='" + MinFrequency + '\'' +
                ", MaxFrequency='" + MaxFrequency + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(String cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMinFrequency() {
        return MinFrequency;
    }

    public void setMinFrequency(String minFrequency) {
        MinFrequency = minFrequency;
    }

    public String getMaxFrequency() {
        return MaxFrequency;
    }

    public void setMaxFrequency(String maxFrequency) {
        MaxFrequency = maxFrequency;
    }

}
