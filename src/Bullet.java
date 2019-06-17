import java.awt.*;


public class Bullet extends GameObject {

    public Bullet(float x, float y, ID id) {
        super(x, y, id);

        VelX = 1;
        VelY = 1;
    }

    @Override
    public void tick() {
        x += VelX;
        y += VelY;

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, 32, 32);

    }
}