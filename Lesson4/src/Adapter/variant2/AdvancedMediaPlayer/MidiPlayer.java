package Adapter.variant2.AdvancedMediaPlayer;

public class MidiPlayer implements AdvancedMediaPlayer {

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
        // empty method = do nothing
    }

    @Override
    public void playMidi(String fileName) {
        System.out.println("Playing MIDI: " + fileName);
    }
}
