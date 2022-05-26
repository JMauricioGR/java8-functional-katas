package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream()
                .flatMap(item -> item.getVideos().stream())
                .map(item -> {
                    HashMap<String, String> result = new HashMap<>();
                    result.put("id", item.getId().toString());
                    result.put("title", item.getTitle());
                    result.put("boxart", item
                            .getBoxarts()
                            .stream()
                            .reduce((acum, elemn) ->
                                acum.getWidth() > elemn.getWidth()?elemn:acum
                            ).map(url -> url.getUrl()).orElseThrow());
                    return result;
                }).collect(Collectors.toList());
        //return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", "url"));
    }

    public static void main(String[] args) {
        Kata7 exercise = new Kata7();
        System.out.println(exercise.execute());
    }
}
