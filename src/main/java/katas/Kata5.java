package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import javax.swing.text.Element;
import java.util.List;
import java.util.Map;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .map(item -> item.getRating())
                .reduce( 0.0, (acumulator, rating)->{
                   Double result = (acumulator > rating)?acumulator:rating;
                    return result;
                });


    }

    public static void main(String[] args) {
        Kata5 exercise1 = new Kata5();
        System.out.println(exercise1.execute());
    }
}
