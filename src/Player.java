import java.awt.*;

public class Player extends GameObject {
    public Player(float x, float y, ID id) {
        super(x, y, id);

        VelX = 3;
        VelY = 2;
    }

    @Override
    public void tick() {
        x += VelX;
        y += VelY;

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        g.fillRect((int)x, (int)y, 32, 32);

    }
}
