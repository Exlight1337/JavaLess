package FirstClass;

public class MyFirstApp {
    public static void main(String[] args){
        int beerNum = 99;
        String world = "бутылок";

        while (beerNum > 0){

            if (beerNum == 1){
                world = "бутылка";
            }

            System.out.println(beerNum + " " + world + "пива на стене");
            System.out.println(beerNum + " " + world + "пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");

            beerNum = beerNum - 1;

            if (beerNum > 0){
                System.out.println(beerNum + " " + world + "пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене.");
            }
        }
    }
}
