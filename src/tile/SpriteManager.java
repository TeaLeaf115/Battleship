package tile;

import java.awt.image.BufferedImage;

import java.util.Arrays;

import java.io.IOException;

public class SpriteManager {
    private BufferedImage[] tileSet;
    public final BufferedImage[] waterTileSet;

    public final BufferedImage[] destroyerTileSet;
    public final BufferedImage[] cruiserTileSet;
    public final BufferedImage[] submarineTileSet;
    public final BufferedImage[] battleshipTileSet;
    public final BufferedImage[] carrierTileSet;

    public final BufferedImage[] indicatorTileSet;

    public SpriteManager() {
        SpriteSheetReader ssr = new SpriteSheetReader("res/images/BattleshipSpritesheet.png", 16, 16);
        try {
            tileSet = ssr.spriteSheetToArray();
        }
        catch (IOException ignored) {}

        waterTileSet = Arrays.copyOfRange(tileSet, 0, 4);

        destroyerTileSet = Arrays.copyOfRange(tileSet, 12, 14);
        cruiserTileSet = Arrays.copyOfRange(tileSet, 6, 9);
        submarineTileSet = Arrays.copyOfRange(tileSet, 9, 12);
        battleshipTileSet = Arrays.copyOfRange(tileSet, 14, 18);
        carrierTileSet = Arrays.copyOfRange(tileSet, 18, 24);

        indicatorTileSet = new BufferedImage[3];
        indicatorTileSet[0] = tileSet[5];
        indicatorTileSet[1] = tileSet[4];
        indicatorTileSet[2] = tileSet[23];
    }
}