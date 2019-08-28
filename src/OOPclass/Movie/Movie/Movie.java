package OOPclass.Movie.Movie;

class Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        if (rating < 10){
        System.out.println("Проигрывание фильма");
        }else{System.out.println("Заебал со своими фиьмами");
        }
    }
}
