import java.util.HashMap;
import java.util.Set;

public class MOTH {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("zombie", "Another head hangs lowly");
        trackList.put("Written in the stars", "Oh written in the stars");
        trackList.put("What it do", "I've seen some souls be friendly");
        trackList.put("Still Waiting", "So am I still waiting");

        String trackName = trackList.get("zombie");
        System.out.println(trackName);

        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.printf("Track name: %s -- Lyrics: %s \n", key, trackList.get(key));
        }

    }
}