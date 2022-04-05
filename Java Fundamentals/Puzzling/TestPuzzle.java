import java.util.Random;
import java.util.ArrayList;

public class TestPuzzle{
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();

        ArrayList<Integer> randomList = puzzle.getTenRolls();
        System.out.println(randomList);
        System.out.println(puzzle.getRandomLetter());
        System.out.println(puzzle.generatePassword());
        System.out.println(puzzle.getNewPasswordSet(10));
    }
}