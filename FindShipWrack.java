public class FindShipWrack extends MapTile{
    public FindShipWrack(int x, int y) {
        super(x, y);
    }

    public void modify_player(Player the_player) {
        System.out.println("Congratulations! You have successfully navigated the cave and escaped to safety!");
        the_player.escape_cave();
    }
}
