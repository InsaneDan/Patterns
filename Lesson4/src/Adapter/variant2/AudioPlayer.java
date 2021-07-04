package Adapter.variant2;

import java.util.Locale;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // plays mp3 files by default
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file (default): " + fileName);
        }

        // adapter to play other file formats
        else if (audioType.equalsIgnoreCase("avi") || audioType.equalsIgnoreCase("mp4") ||
                 audioType.equalsIgnoreCase("mov") || audioType.equalsIgnoreCase("midi")) {

            mediaAdapter = new MediaAdapter (audioType);
            mediaAdapter.play (audioType, fileName);
        }

        else {
            System.out.println("Error. '" + audioType.toUpperCase(Locale.ROOT) + "' format is not supported");
        }
    }
}