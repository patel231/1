public class TreasureBox extends LootBox {
    public TreasureBox(int x, int y, Gold geld){
        super(x, y, geld);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice a gold coin with 15 stamped on the front.");
        else
            return "";
    }
}