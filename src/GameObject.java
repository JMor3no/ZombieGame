import java.awt.Graphics;

public abstract class GameObject {

    protected  float x, y;
    protected float VelX, VelY;
    protected ID id;

    public GameObject (float x, float y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelX() {
        return VelX;
    }

    public void setVelX(float velX) {
        VelX = velX;
    }

    public float getVelY() {
        return VelY;
    }

    public void setVelY(float velY) {
        VelY = velY;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
