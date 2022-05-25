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
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();

        List<Map> newMovies = movies.stream().map(movie -> {
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("id", movie.getId().toString());
            result.put("title", movie.getTitle());
            return result;
        }).collect(Collectors.toList());

        return newMovies;
    }

    public static void main(String[] args) {
        Kata1 exercise1 = new Kata1();
        System.out.println(exercise1.execute());
    }
}


