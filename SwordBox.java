public class SwordBox extends LootBox{
    public SwordBox(int x, int y, Sword sword){
        super(x, y, sword);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice a gold coin with 15 stamped on the front.");
        else
            return "";
    }
}
