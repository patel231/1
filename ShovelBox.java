public class ShovelBox extends LootBox{
    public ShovelBox (int x, int y, Shovel shovel){
        super(x, y, shovel);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice a gold coin with 15 stamped on the front.");
        else
            return "";
    }
}
