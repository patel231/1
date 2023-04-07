public class KnifeBox extends LootBox{
    public KnifeBox(int x, int y, Knife knife){
        super(x, y, knife);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice a gold coin with 15 stamped on the front.");
        else
            return "";
    }
}
