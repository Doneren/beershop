package product;

public class Drink extends Product{

    private boolean alcoholContent; //content of alcohol in drink

    public boolean isAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(boolean alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

}
