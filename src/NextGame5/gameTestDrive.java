package NextGame5;

public class gameTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}
