package Plant;

public class Plant {

    String name;
    PlantType plantType;
    int health;
    int waterLevel;
    int sunlightLevel;

    public Plant(String name, PlantType plantType) {
        this.name = name;
        this.plantType = plantType;
        this.health = 100;
        this.waterLevel = 100;
        this.sunlightLevel = 100;

    }

    public void water(){
        if (this.waterLevel == 100){
            setWaterLevel(100);
        } else if ((this.waterLevel + this.plantType.getWaterIncrement()) > 100) {
            setWaterLevel(100);
        } else {setWaterLevel(this.waterLevel + this.plantType.getWaterIncrement());}
    }

    public void provideSunlight(){
        if (this.sunlightLevel == 100){
            setSunlightLevel(100);
        } else if ((this.sunlightLevel + this.plantType.getSunlightIncrement() > 100)) {
            setSunlightLevel(100);
        } else {
            setSunlightLevel((sunlightLevel + this.plantType.getSunlightIncrement()));
        }
    }
    public void displayStatus(){
        System.out.println(this.toString());
    }
    public void degrade(){

        if (this.waterLevel > 0){
            setWaterLevel(this.waterLevel - 5);
        } if (this.sunlightLevel > 0){
            setSunlightLevel(this.sunlightLevel - 5);
        } if (this.health > 0){
            setHealth(this.health - 5);
        }


    }

    //getters

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public int getSunlightLevel() {
        return sunlightLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    //setters

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public void setSunlightLevel(int sunlightLevel) {
        this.sunlightLevel = sunlightLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    @Override
    public String toString() {
        return "***************************************\n" +
                "Plant stats:" + "\n" +
                "health: " + health + "\n" +
                "name: " + name + "\n" +
                "plant type: " + this.plantType.getName() + "\n" +
                "waterLevel: " + waterLevel + "\n" +
                "sunlight level: " + sunlightLevel + "\n" +
                "***************************************";

    }
}
