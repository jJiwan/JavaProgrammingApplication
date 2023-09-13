package book;
enum GenderOld { MALE, FEMALE }

enum Direction { EAST, WEST, SOUTH, NORTH }
public class EnumDemo01  {
    public static void main(String[] args) {
        GenderOld gender = GenderOld.FEMALE;
        if (gender == GenderOld.MALE)
            System.out.println(GenderOld.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(GenderOld.FEMALE + "은 병역 의무가 없다.");

//        if (gender == Direction.SOUTH)
//            System.out.println(Direction.SOUTH + "는 누구?");
//        gender = 5;

        Direction direction = Direction.EAST;
        //Direction direction = 2;
        //Direction direction = (Direction) 2;
        if(direction == Direction.SOUTH)
            System.out.println(Direction.SOUTH + "는 누구?");
    }
}
