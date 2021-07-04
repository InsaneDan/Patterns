package Adapter.variant2.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playAvi(String fileName) {
        // empty method = do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4: " + fileName);
    }

    @Override
    public void playMov(String fileName) {
        // empty method = do nothing
    }

    @Override
    public void playMidi(String fileName) {
        // empty method = do nothing
    }
}
