package enumeration;

public class Main {
    public static void main(String[] args) {

        Direction d = Direction.NORTH;

//        d.move();

        Direction[] dArray = Direction.values();
        for(Direction di: dArray)
        {
            di.move();
        }

        Direction direction = Direction.valueOf("EAST");
        direction.move();
    }
}
