package NextGame5;

public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        DotCom  udot = new DotCom();
        int randomNum =(int) (Math.random() * 5);
        int[] locations = {randomNum,  randomNum + 1, randomNum +  2};
        udot.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String result = udot.checkYourself(guess);
            numOfGuess++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось" + " " + numOfGuess +" " + "попыток(и)");
            }
        }
    }
}
