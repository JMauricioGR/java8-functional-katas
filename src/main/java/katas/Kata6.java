package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .map(item -> item.getBoxarts())
                .flatMap(item -> item.stream())
                .reduce((acum, elem) ->
                   acum.getWidth() > elem.getWidth()?acum: elem)
                .map(boxArt -> boxArt.getUrl()).orElseThrow();


    }
    public static void main(String[] args) {
        Kata6 exercise1 = new Kata6();
        System.out.println(exercise1.execute());
    }
}
