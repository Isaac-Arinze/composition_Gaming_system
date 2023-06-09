package org.example;

public class Laptop  {
    private  float Screen;
    private String keyboard;
    private Processor processor;
    private String ram;
    private GraphicalCard graphicalCard;
    private String opticalDrive;
    private String hardDrive;

    public Laptop() {
        this.Screen = 15.7f;
        this.keyboard = "Dell-1200";
        this.processor = new Processor();
        this.ram = "DDRA";
        this.graphicalCard = new GraphicalCard();
        this.opticalDrive = "MLT layer ";
        this.hardDrive = "3TB";
    }

    public Laptop(float screen, String keyboard, Processor processor, String ram, GraphicalCard graphicalCard, String opticalDrive, String hardDrive) {
       super();
        this.Screen = screen;
        this.keyboard = keyboard;
        this.processor = processor;
        this.ram = ram;
        this.graphicalCard = graphicalCard;
        this.opticalDrive = opticalDrive;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Screen=" + Screen +
                ", keyboard='" + keyboard + '\'' +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", graphicalCard=" + graphicalCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                '}';
    }
       public Processor getProcessor() {
        return processor;
    }

    public float getScreen() {
        return Screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getRam() {
        return ram;
    }

    public GraphicalCard getGraphicalCard() {
        return graphicalCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String gamingMode(){
        processor.setFrequency(processor.getMaxFrequency());
        return "success";
    }
}

