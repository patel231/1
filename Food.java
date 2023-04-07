public class Food extends Item {
    // Attributes
    private int nutrition;


    // Constructor
    public Food(String name, int nutrition) {
        super(name,nutrition);
        this.nutrition = nutrition;
    }

    // Methods


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
