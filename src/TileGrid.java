//public class TileGrid {
//
//    public Tile[][] map;
//
//    public TileGrid() {
//        map = new Tile[20][15];
//        for(int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.grass);
//            }
//        }
//    }
//
//    public void Draw() {
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                Tile t = map[i][j];
//                DrawQuadTex(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
//            }
//        }
//    }
//}
