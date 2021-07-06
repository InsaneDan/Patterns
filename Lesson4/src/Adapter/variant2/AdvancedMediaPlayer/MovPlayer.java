package Adapter.variant2.AdvancedMediaPlayer;

public class MovPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAvi(String fileName) {
        // empty method = do nothing
    }

    @Override
    public void playMp4(String fileName) {
        // empty method = do nothing
    }

    @Override
    public void playMov(String fileName) {
        System.out.println("Playing MOV: " + fileName);
    }

    @Override
    public void playMidi(String fileName) {
        // empty method = do nothing
    }
}
