import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] world;
    static Point startingPosition = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void loadTiles() {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader f = new BufferedReader(new FileReader("src/map.txt"))) {
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row.split("\t"));
            }
            int xMax = rows.get(0).length;
            world = new String[rows.size()][xMax];
            for (int y = 0; y < rows.size(); y++) {
                String[] cols = rows.get(y);
                for (int x = 0; x < xMax; x++) {
                    String tileName = cols[x];
                    if (tileName.equals("Starting Point")) {
                        startingPosition.x = x;
                        startingPosition.y = y;
                    }
                    world[y][x] = tileName.equals(" ") ? null : tileName;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[][] getWorld() {
        return world;
    }

    public static Point getStartingPosition() {
        return startingPosition;
    }

    public static ArrayList<MapTile> getHistory() {
        return history;
    }

    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;

        //Todo : verify the x and y exist in the world
        if ((x >= 0 && x < world.length) && (y >= 0 && y < world[0].length)
                && world[x][y] != null) {
            switch (world[x][y]) {
                case "StartingRoom":
                    mt = new StartingRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "CrocodileTerritory":

                    mt = new CrocodileTerritory(x, y, new Crocodile());
                    mt = checkRoomExists(mt);
                    break;
                case "DevilReefCarbTerritory":
                    mt = new DevilReefCarbTerritory(x, y, new DevilReefCrab());
                    mt = checkRoomExists(mt);
                    break;
                case "ScorpionsTerritory":
                    mt = new ScorpionsTerritory(x, y, new Scorpions());
                    mt = checkRoomExists(mt);
                    break;
                case "SnakeTerritory":
                    mt = new SnakeTerritory(x, y, new Snake());
                    mt = checkRoomExists(mt);
                    break;
                case "WidowSpiderTerritory":
                    mt = new WidowSpiderTerritory(x, y, new WidowSpider());
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureRoom":
                    mt = new TreasureBox(x, y, new Gold(15));
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyBox":
                    mt = new EmptyBox(x, y);
                    break;
                case "FoodBox":
                    mt = new FoodBox(x, y, new Food("Apple", 50));
                    mt = checkRoomExists(mt);
                    break;
                case "KnifeBox":
                    mt = new KnifeBox(x, y, new Knife());
                    mt = checkRoomExists(mt);
                    break;
                case "ShovelBox":
                    mt = new ShovelBox(x, y, new Shovel());
                    mt = checkRoomExists(mt);
                    break;
                case "SwordBox":
                    mt = new SwordBox(x, y, new Sword());
                    mt = checkRoomExists(mt);
                    break;
                case "HammerBox":
                    mt = new HammerBox(x, y, new Hammer());
                    mt = checkRoomExists(mt);
                    break;
                case "LeaveCaveRoom":
                    mt = new FindShipWrack(x, y);
                    break;
            }
        }
        return mt;

    }
    private static MapTile checkRoomExists(MapTile mt) {
        if (history.indexOf(mt) != -1) {
            mt = history.get(history.indexOf(mt));
        } else {
            history.add(mt);
        }
        return mt;
    }
}

