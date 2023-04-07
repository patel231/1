public class HammerBox extends LootBox{
    public HammerBox(int x, int y, Hammer hammer){
        super(x, y, hammer);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice a gold coin with 15 stamped on the front.");
        else
            return "";
    }
}
