package Plant;

public class DecreasePlantStats extends Thread{
    PlantCareAssistant plantCareAssistant;
    public volatile boolean allPlantsAreDead = false;

    public DecreasePlantStats(PlantCareAssistant plantCareAssistant){
        this.plantCareAssistant = plantCareAssistant;
    }
    public void run(){
        while (!allPlantsAreDead){
            int counter = 0;

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (Plant plant : plantCareAssistant.plants){
                plant.degrade();

                if (plant.getHealth() == 0){
                    counter++;
                }
            }

            if (counter == plantCareAssistant.plants.size()){
                System.out.println("All plants are dead!");
                setAllPlantsAreDead(true);
                System.exit(0);
            }
        }

    }

    public void setAllPlantsAreDead(boolean allPlantsAreDead) {
        this.allPlantsAreDead = allPlantsAreDead;
    }

    public boolean areAllPlantsAreDead() {
        return allPlantsAreDead;
    }
}
