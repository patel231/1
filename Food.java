public class Food extends Item {
    // Attributes
    private int nutrition;


    // Constructor
    public Food(String name, int nutrition) {
        super(name,nutrition);
        this.nutrition = nutrition;
    }

    public Food() {
        super();
        nutrition = 100;
    }

    public void reduceNutrition(int amount) {
        nutrition -= amount;
        if (nutrition < 0) {
            nutrition = 0;
        }
    }

    public void increaseNutrition(int amount) {
        nutrition += amount;
        if (nutrition > 100) {
            nutrition = 100;
        }
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNutrition() {
        return this.nutrition;
    }

    public void setNutrition(int nutrition) {
        this.nutrition = nutrition;
    }

}
