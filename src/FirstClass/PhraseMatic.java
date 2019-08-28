package FirstClass;

public class PhraseMatic {
    public static void main(String[] args) {
        String[] worldListOne = { "OG", "ЛИКВИДЫ"};

        int oneLength = worldListOne.length;

        int rand1 = (int) (Math.random() * oneLength);

        String phrase = worldListOne[rand1] + " " ;
        System.out.println("Победитель, - это " + phrase);
    }
}
