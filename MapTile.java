import java.util.*;
public class MapTile {
    int x;
    int y;
    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x)
            return false;
        if (x != other.y)
            return false;
        return true;
    }

    public String intro_text(){throw new UnsupportedOperationException();}

    public void modify_player(Player player) {throw new UnsupportedOperationException();}
    public ArrayList<Action> adjacent_moves(){
        ArrayList<Action> moves = new ArrayList<>();
        if (World.tile_exists(x, y +1) !=null)
            moves.add(new MoveRight());
        if (World.tile_exists(x, y -1) !=null)
            moves.add(new MoveLeft());
        if (World.tile_exists(x -1, y) !=null)
            moves.add(new MoveUp());
        if (World.tile_exists(x +1, y) !=null)
            moves.add(new MoveDown());
        return moves;
    }
    public ArrayList<Action> available_action(){
        ArrayList<Action> moves = new ArrayList<>();
        moves = adjacent_moves();
        moves.add(new ViewInventory());
        return moves;
    }
}