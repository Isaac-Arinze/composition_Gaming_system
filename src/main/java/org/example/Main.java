package org.example;

public class Main {
    public static void main(String[] args) {
//        Laptop lappy = new Laptop();
//        System.out.println(lappy.getProcessor().getThreads());

        Processor processor = new Processor("intel", "7200U", 7, 4, "44mb",
                "6GHz", "2GHz", "80GHz" );

        GraphicalCard graphicalCard = new GraphicalCard("Dell", 1200, "8mB");

        Laptop gamingLaptop = new Laptop(19f, "Dell", processor, "8mb", graphicalCard, null, "250GB");
        System.out.println(gamingLaptop);

        gamingLaptop.gamingMode();
        System.out.println("Gaming mode on");
        System.out.println("current frequency " + gamingLaptop.getProcessor().getFrequency());

    }

}
