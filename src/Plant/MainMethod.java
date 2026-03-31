package Plant;

import java.util.Scanner;

public class MainMethod {
    PlantCareAssistant careAssistant = new PlantCareAssistant();
    DecreasePlantStats decreasePlantStats = new DecreasePlantStats(careAssistant);

    Scanner input = new Scanner(System.in);

    public void run(){


        PlantType Lily = new PlantType("Peace Lily");
        PlantType Pothos = new PlantType("Pothos");
        PlantType Succulent = new PlantType("Succulent");
        PlantType Philodendron = new PlantType("Philodendron");

        careAssistant.addPlant("My First Lily", Lily);
        careAssistant.addPlant("My First Pothos", Pothos);
        careAssistant.addPlant("My First Succulent", Succulent);
        careAssistant.addPlant("My Second Philodendron", Philodendron);
        careAssistant.addPlant("My Second Lily", Lily);

        decreasePlantStats.start();

        while(true){

            System.out.println("Welcome to the Plant Care Assistant, what would you like to do? \n1 - Water Plant\n2 - Provide Sunlight\n3 - View Plant Stats\n4 - View all plant stats\n5 - Exit");

            int answer = input.nextInt();
            input.nextLine();

            switch (answer){
                case 1:
                    System.out.println("Type the name of the plant you would like to water: ");
                    String name = input.nextLine();
                    careAssistant.waterPlant(name);
                    break;

                case 2:
                    System.out.println("Type the name of the plant you would like to provide sunlight to: ");
                    String sunlightName = input.nextLine();
                    careAssistant.provideSunlightToPlant(sunlightName);
                    break;

                case 3:
                    System.out.println("Type the name of the plant you would like to view stats for: ");
                    String statsName = input.nextLine();
                    careAssistant.displayStatusOfPlant(statsName);
                    break;

                case 4:
                    careAssistant.displayStatusOfAllPlants();
                    break;

                case 5:
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Unrecognized input");

            }
        }


    }

    public static void main(String[] args) {
        MainMethod main = new MainMethod();
        main.run();
    }
}
