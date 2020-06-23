import java.awt.*;
import java.util.Random;

/**
 * A Hunter turns zombies into plants
 * <p>
 * @author  Abdias Baldiviezo
 * @version 1.0
 * @since   2020-01-15
 * @see Creature
 */
public class Hunter extends Creature implements Aggressor,Movable,Spawner {
    Random _rand;
    boolean _spawn=false;
    /**
     * Spawn the Hunter with 10 life.
     */
    public Hunter() {
        _rand = new Random();
        _health=10;
    }
    //pertaining to the Aggressor interface
    /**
     * If the creature we've encountered is a zombie, we'll turn it into a zombie.
     * @param target The {@link Creature} we've encountered.
     */
    public void attack(Creature target) {
        if(target instanceof Zombie) {
            ((Zombie) target)._isAlive=false;
            _spawn=true;
        }
    }

    Shape getShape() {
        return Shape.Circle;
    }

    Color getColor() {
        return new Color(255,0,0);
    }

    Boolean isAlive() {
        return _health > 0;
    }

    public void move() {
        // Choose a random direction each time move() is called.
        switch(_rand.nextInt(4)) {
            case 0:
                _location.x++;
                break;
            case 1:
                _location.x--;
                break;
            case 2:
                _location.y++;
                break;
            case 3:
                _location.y--;
                break;
            default:
                break;
        }
    }

    public Creature spawnNewCreature() {
        if (_spawn) {
            _spawn=false;
            return new Plant();

        }
        else {
            return null;
        }
    }
}
