import java.awt.*;

abstract class Piece
{
    protected String name;
    protected Player player;
    protected Tile tile;
    protected Shape shape;
    public static int numOfPieces;//constructor and destructor.
    public String getName()
    {
        return name;
    }
    public abstract void move();
    public abstract void morph();
}