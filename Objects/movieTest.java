package Objects;

public class movieTest {
    public static void main(String[] Args){
        Movie one = new Movie();
        one.title = "ABC";
        one.genre = "Comedy";
        one.Rating = 4;
        one.play();

        Movie two = new Movie();
        two.title = "DEF";
        two.genre = "Action";
        two.Rating = 5;
        two.play();
    }
}
