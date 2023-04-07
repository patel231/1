public class LootBox extends MapTile{
    Item item;
    public boolean pickedItem = false;
    public LootBox(int x, int y, Item item){
        super(x, y);
        this.item = item;
    }
    public void add_Loot(Player player){
        player.inventory.add(item);
        pickedItem = true;
    }
    public void modify_player(Player player){
        if(pickedItem == false)
            add_Loot(player);
    }
}