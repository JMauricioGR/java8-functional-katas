package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.MovieList;
import util.DataUtil;

import java.util.*;
import java.util.stream.Collectors;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        /*return Arrays.stream(movieLists.stream()
                .flatMap(video -> video.getVideos().stream())
                .flatMap(boxart -> boxart.getBoxarts().stream())
                .filter(box -> box.getHeight() == 200 && box.getWidth() == 150).map(item -> {
                            List<BoxArt> boxartsItems = new ArrayList<>();
                            boxartsItems.add(item.);

                        })

                .map(item -> {
                    HashMap<String, String> list = new HashMap<>();
                    list.put("id", item.getUrl());
                    list.put("title", item.getHeight().toString());
                    list.put("boxart", item.getWidth().toString());
                    return list;
                }).collect(Collectors.toList()
        );*/

        return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", new BoxArt(150, 200, "url")));
    }

    public static void main(String[] args) {
        Kata4 exercise1 = new Kata4();
        System.out.println(exercise1.execute());
    }
}
