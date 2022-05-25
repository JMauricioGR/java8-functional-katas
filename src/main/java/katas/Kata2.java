package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Chain filter() and map() to collect the ids of videos that have a rating of 5.0
    DataSource: DataUtil.getMovies()
    Output: List of Integers
*/
public class Kata2 {
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();

         return movies.stream().filter(movie -> movie.getRating() == 5.0).map(item -> {
            Integer result = item.getId();
            return result;
        }).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        Kata2 exercise1 = new Kata2();
        System.out.println(exercise1.execute());
    }
}
