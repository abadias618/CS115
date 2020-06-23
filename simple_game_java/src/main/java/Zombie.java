import java.awt.*;
import java.util.Random;

/**
 *  It will start out by moving from left to right across the screen,
 *  devouring anything it comes in contact with, except for plants.
 * <p>
 * @author  Abdias Baldiviezo
 * @version 1.0
 * @since   2020-01-15
 * @see Creature
 */
public class Zombie extends Creature implements Movable,Aggressor {
    Random _rand;
    boolean _isAlive=true;
    /**
     * Spawn the zombie with with no life,
     * that's why the isAlive function always returns true
     */
    public Zombie() {
        _rand = new Random();
    }

    //pertaining to the Aggressor interface
    /**
     * If the creature we've encountered is not a plant, we'll eat it.
     * @param target The {@link Creature} we've encountered.
     */
    public void attack(Creature target) {
        if(target instanceof Animal || target instanceof Wolf) {
            target.takeDamage(10);
        }
    }
    //Pertaining to the Movable interface
    public void move() {
        // Each time move() is called, zombie moves from left to right.
        _location.x++;
    }

    //Methods pertaining to the Creature Abstract Class
    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(0,0,255);
    }

    Boolean isAlive() {
        return _isAlive;
    }
}
