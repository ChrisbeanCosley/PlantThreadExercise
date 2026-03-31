package Plant;

import java.util.ArrayList;

public class PlantCareAssistant {

    ArrayList<Plant> plants = new ArrayList<Plant>();

    public void addPlant(String name, PlantType type){
        plants.add(new Plant(name, type));
    }
    public void waterPlant(String name){

        for (Plant plant : plants){
            if (plant.getName().equals(name)){
                plant.water();
                if (plant.getHealth() == 100){
                    plant.setHealth(100);
                } else if ((plant.getHealth() + 10 > 100)) {
                    plant.setHealth(100);
                } else {plant.setHealth(plant.getHealth() + 10);}
                System.out.println(plant.getName() + " has been watered and has the following stats: ");
                plant.displayStatus();
                break;
            }

        }

    }
    public void provideSunlightToPlant(String name){
        for (Plant plant : plants){
            if (plant.getName().equals(name)){
                plant.provideSunlight();
                if (plant.getHealth() == 100){
                    plant.setHealth(100);
                } else if ((plant.getHealth() + 10 > 100)) {
                    plant.setHealth(100);
                } else {plant.setHealth(plant.getHealth() + 10);}
                System.out.println(plant.getName() + " has been provided sunlight and has the following stats: ");
                plant.displayStatus();
                break;
            }

        }
    }
    public void displayStatusOfPlant(String name){
        for (Plant plant : plants){
            if (plant.getName().equals(name)){
                plant.displayStatus();
            }

        }
    }

    public void displayStatusOfAllPlants(){
        for (Plant plant : plants){
            plant.displayStatus();
        }

    }
    public void startBackgroundDegradation(){


    }



}
