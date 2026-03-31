package Plant;

public class PlantType {
    String name;
    int waterIncrement;
    int sunlightIncrement;

    public PlantType(String name){

        switch (name) {
            case "Monstera" -> {
                this.name = "Monstera";
                this.waterIncrement = 5;
                this.sunlightIncrement = 5;
            }
            case "Peace Lily" -> {
                this.name = "Peace Lily";
                this.waterIncrement = 10;
                this.sunlightIncrement = 10;
            }
            case "Pothos" -> {
                this.name = "Pothos";
                this.waterIncrement = 15;
                this.sunlightIncrement = 15;
            }
            case "Succulent" -> {
                this.name = "Succulent";
                this.waterIncrement = 25;
                this.sunlightIncrement = 25;
            }
            case "Philodendron " -> {
                this.name = "Philodendron";
                this.waterIncrement = 20;
                this.sunlightIncrement = 20;
            }
        }
    }

    //getters

    public String getName() {
        return name;
    }

    public int getSunlightIncrement() {
        return sunlightIncrement;
    }

    public int getWaterIncrement() {
        return waterIncrement;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setSunlightIncrement(int sunlightIncrement) {
        this.sunlightIncrement = sunlightIncrement;
    }

    public void setWaterIncrement(int waterIncrement) {
        this.waterIncrement = waterIncrement;
    }


}
