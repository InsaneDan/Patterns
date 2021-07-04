package Adapter.variant2.AdvancedMediaPlayer;

public class AviPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing AVI: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // empty method = do nothing
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
