public class StartingRoom extends MapTile {
    public StartingRoom(int x,int y){
        super(x, y);
    }


    public String intro_Text() {
        return "\n You find yourself in a cave with a flickering torch on the wall.\nYou cn make out four paths, each equally as dark";
    }
    public void modify_player(Player player){

    }
}