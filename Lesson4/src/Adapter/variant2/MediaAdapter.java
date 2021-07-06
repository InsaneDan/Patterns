package Adapter.variant2;

import Adapter.variant2.AdvancedMediaPlayer.*;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if (audioType.equalsIgnoreCase("avi")) {
            advancedMusicPlayer = new AviPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("mov")) {
            advancedMusicPlayer = new MovPlayer();
        } else if (audioType.equalsIgnoreCase("midi")) {
            advancedMusicPlayer = new MidiPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("avi")) {
            advancedMusicPlayer.playAvi(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("mov")) {
            advancedMusicPlayer.playMov(fileName);
        } else if (audioType.equalsIgnoreCase("midi")) {
            advancedMusicPlayer.playMidi(fileName);
        }
    }
}
