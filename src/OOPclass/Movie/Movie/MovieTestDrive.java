package OOPclass.Movie.Movie;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Комменчу ласт интик";
        one.genre = "Комендия";
        one.rating = 10;
        one.playIt();


        Movie two = new Movie();
        two.title = "Евангелион или как подрочить на больную";
        two.genre = "Психоделика";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Чудачество любви не помеха";
        three.genre = "Любофьь";
        three.rating = 8;
        three.playIt();
    }
}
