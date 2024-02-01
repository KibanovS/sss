import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    private final Movie movie1 = new Movie(1, "Бладшот", "боевик");
    private final Movie movie2 = new Movie(2, "Вперёд", "мультфильм");
    private final Movie movie3 = new Movie(3, "Отель \"Белград\"", "комедия");
    private final Movie movie4 = new Movie(4, "Джентельмены", "боевик");
    private final Movie movie5 = new Movie(5, "Человек-невидимка", "ужасы");
    private final Movie movie6 = new Movie(6, "Тролли. Мировой тур", "мультфильм");
    private final Movie movie7 = new Movie(7, "Номер один", "комедия");

    @Test
    public void shouldAddMovie() {
        MovieManager movie = new MovieManager();
        movie.add(movie1);
        movie.add(movie2);
        Movie[] expected = {movie1, movie2};
        Movie[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        MovieManager movie = new MovieManager();

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5};
        Movie[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastAdded() {
        MovieManager movie = new MovieManager();

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};
        Movie[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit3() {
        MovieManager movie = new MovieManager(3);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie1, movie2, movie3};
        Movie[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit7() {
        MovieManager movie = new MovieManager(7);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
