import java.util.HashMap;
import java.util.Set;
public class HashMapAssignment{
    public static void main(String[]args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Leave The Door Open", "Ima leave the door oooooopen");
        trackList.put("Smokin Out The Window", "This BITCH");
        trackList.put("After Last Night", "Those days are throuuuuugh");
        trackList.put("Put On A Smile", "But Lord knows I'm dyin");

        String song = trackList.get("Leave The Door Open");

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}

