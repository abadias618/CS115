import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Wolves start out by moving in a random direction, searching for something to eat.
 * If a wolf senses an animal nearby, it will decide to move in that direction as
 * soon as possible. If it lands on an animal, it will eat it. Wolves will not eat
 * or purposefully move towards zombies or plants.
 * <p>
 * @author  Abdias Baldiviezo
 * @version 1.0
 * @since   2020-01-15
 * @see Creature
 */
public class Wolf extends Creature implements Movable,Aware,Aggressor,Spawner {
    Random _rand;
    private String _preferredDirection;
    private boolean _spawn=false;
    /**
     * Spawn the wolf with 5 life.
     */
    public Wolf() {
        _rand = new Random();
        _health=1;
        _preferredDirection = "none";
    }
    //pertaining to the Aggressor interface
    /**
     * If the creature we've encountered is not a plant or a zombie, we'll eat it.
     * @param target The {@link Creature} we've encountered.
     */
    public void attack(Creature target) {
        if(target instanceof Animal) {
            target.takeDamage(5);
            _spawn=true;
        }
    }

    /**
     * When the senseNeighbors() function is called, the Wolf instance should change
     * its preferred direction to be in the direction of the first Animal instance
     * it sees. When checking for nearby animals, it should first check in the
     * direction it's already moving. If no Animal instance is there, it should
     * search in a clockwise pattern starting at the top.
     * So, if the Wolf is moving left, it should first check the creature provided
     * in the left parameter of senseNeighbors() , followed by above, then right,
     * then below.
     * */
    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        while (true) {
            //check previous preferred direction
            if (_preferredDirection == "right" && right instanceof Animal) {
                break;
            } else if (_preferredDirection == "left" && left instanceof Animal) {
                break;
            } else if (_preferredDirection == "up" && above instanceof Animal) {
                break;
            } else if (_preferredDirection == "down" && below instanceof Animal) {
                break;
            }
            //iterate from the top
            if (above instanceof Animal) {
                break;
            } else if (right instanceof Animal) {
                break;
            } else if (below instanceof Animal) {
                break;
            } else if (left instanceof Animal) {
                break;
            }
            //if we don't find any animal instance we just set
            //the _preferredDirection to none, which will be random
            else {
                _preferredDirection="none";
                break;
            }
        }
    }

    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(128,128,128);
    }

    Boolean isAlive() {
        return _health > 0;
    }

    //Pertaining to the Movable Interface
    public void move() {
        if (_preferredDirection=="none") {
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
        //move to the _preferredDirection
        else {
            if (_preferredDirection=="right"){
                _location.x++;
            }
            else if (_preferredDirection=="left"){
                _location.x--;
            }
            else if (_preferredDirection=="up"){
                _location.y++;
            }
            else if (_preferredDirection=="down"){
                _location.y--;
            }

        }
    }
    /**
     * Every time a wolf eats another animal, it should gain the ability to spawn
     * a new wolf on its next turn.
     * The newly spawned wolf should be created in the square directly to the left
     * of its parent. After spawning a new wolf, the parent should lose the ability
     * to spawn new wolves until the next time it eats an animal.
     */
    public Creature spawnNewCreature() {
        if (_spawn) {
            _spawn=false;
            return new Wolf();

        }
        else {
            return null;
        }
    }
}
