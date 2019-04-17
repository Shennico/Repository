import java.awt.*;
class Player
{
    private Color color;
    private boolean checkWhiteTurn(int turn)
    {
        if(turn%2 == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}