package katas;

import com.google.common.collect.ImmutableList;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream()
                .flatMap(movie -> movie.getVideos().stream())
                .map(video -> video.getId())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Kata3 exercise1 = new Kata3();
        System.out.println(exercise1.execute());
    }
}
